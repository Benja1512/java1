package bankaccountapp;

public class Checking extends Account{

    // List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties
        public Checking(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            accountNumber = "2" + accountNumber;
            setDebitCard();
        }

    private void setDebitCard() {
    }

    @Override
    public void setRate() {
       rate = getBaseRate() * .15;
    }

    // List any methods specific to the checking accounts
    private void settDebitCardPIN() {
            debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
            debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
            System.out.println("CARD: " + this.debitCardNumber);
            System.out.println("PIN: " + this.debitCardPIN);

    }
    public void showInfo() {
            super.showInfo();
            System.out.println("Your Checking Account Feature" +
                    "\n Debit Card Number: " + debitCardNumber +
                    "\n Debit Card PIN: " + debitCardPIN
                    );
        }


}
