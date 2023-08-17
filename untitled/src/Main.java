
import hdfcbank.canara;
import hdfcbank.dell;
import hdfcbank.macbook;

public class Main{
    public static void main(String[] args)
    {
        canara b1= new canara();
        b1.createaccount();

        dell c1= new dell();
        c1.accountcreated();

        macbook d1= new macbook();
        d1.createaccount();
    }

}