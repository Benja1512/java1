package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args){

        Checking chkacc1 = new Checking("Tom Wilson", "11233456545678",1500);

        Savings savacc1 = new Savings("Rich Love", "4566577868999", 2500);


        chkacc1.showInfo();

        System.out.println("*****************");

        savacc1.showInfo();

        savacc1.deposit(5000);
        savacc1.withdraw(5000);
        savacc1.transfer("Brokerage", 3000);

        // Read a CSV File then create a new account based on that data
    }
}
