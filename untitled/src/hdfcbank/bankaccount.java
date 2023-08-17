package hdfcbank;

public abstract class bankaccount implements bankinterface {

    @Override
    public void createaccount() {
        int rate = 12;
        int nyears=7;

        int p=3;



        int total=p*nyears*rate/100;

        System.out.println("the simple interest for the current account is:"+total);

    }
}
