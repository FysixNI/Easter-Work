import java.util.ArrayList;

public class Transaction
{
    private ArrayList<Item> items;

    public Transaction()
    {
        this.items = new ArrayList<>();
    }

    public void addItem(Item anItem)
    {
        this.items.add(anItem);
    }

    /**
     * Returns the number of items in the transaction
     * @return the number of items in the transaction
     */
    public int getNumberOfItems()
    {
        return this.items.size();
    }

    public int getSubtotal()
    {
        int subtotal = 0;

        for (Item item : this.items)
        {
            subtotal = subtotal + item.getPrice();
        }

        return subtotal;
    }

    /**
     * Attempts to pay for the transaction. If the given amount is equal to or greater than the subtotal,
     * the transaction is paid for and cleared and the amount of change due is given to the caller.
     * @return the amount of change in pence
     */
    public int pay(int anAmount)
    {
        int change = 0;

        if (anAmount >= this.getSubtotal())
        {
            change = anAmount - this.getSubtotal();
            this.items.clear();
        }
        else
        {
            System.out.println("Amount must be greater than or equal to " + this.getSubtotal());
        }

        return change;
    }

    public void cancelLastItem()
    {
        if(items.isEmpty() == false)
        {
            int index = items.size() - 1;
            items.remove(index);
        }

    }

}
