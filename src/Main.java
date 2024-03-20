

public class Main
{
    public static void main(String[] args)
    {
       Item i = new Item(200, "FANCY BISCUITS");
       Item i2 = new Item(300, "FANCY CHOCOLATE");
       Item i3 = new Item(250, "KITTY KIBBLE");

       //System.out.println(i.toString());

       Transaction t = new Transaction();
       t.addItem(i);
       t.addItem(i2);
       t.addItem(i3);

       System.out.println(t.getNumberOfItems());
       t.cancelLastItem();
       System.out.println(t.getNumberOfItems());

       //System.out.println(t.getSubtotal());
       //System.out.println(t.pay( 500));

    }
}