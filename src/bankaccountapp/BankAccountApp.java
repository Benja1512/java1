package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args){

        Checking chkacc1 = new Checking("Tom Wilson", "11233456545678",1500);

        Savings savacc1 = new Savings("Rich Love", "4566577868999", 2500);

        savacc1.compound();

        chkacc1.showInfo();

        System.out.println("*****************");

        savacc1.showInfo();


        // Read a CSV File then create a new account based on that data
    }
}
