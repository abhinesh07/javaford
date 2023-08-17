package hdfcbank;

public abstract class savingsaccount implements bankinterface{

    @Override
    public void accountcreated() {
        System.out.println("the account is created");
    }

    @Override
    public void createaccount() {
        int rate = 7;
        int nyears=7;

        int p=3;



        int total=p*nyears*rate/100;

        System.out.println("the simple interest for the current account is:"+total);

    }
}
