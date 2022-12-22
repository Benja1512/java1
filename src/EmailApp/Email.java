package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private final String setDepartment;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String AlternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "aeycompany.com";
    private int getMailboxCapacity = 500;
    private String setAlternateEmail;

    // constructor to receive  the first name and last name

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

            //call a method asking for department  - return the department
            this.setDepartment = setDepartment();

            // call a method that return a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println("Your Password is: " + this.password);

            // combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

        }


    // ask for the department
    private String setDepartment() {
            System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for accounting\nEnter department code: ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) { return "sales"; }
            else if(depChoice == 2) { return "dev"; }
            else if(depChoice == 3) { return "acct"; }
            else { return ""; }
        }

    // generate a random password

    private String randomPassword (int length) {
            String passwordSet =  " ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char [] password = new char[length];
            for (int i=0; i<length; i++) {
               int rand = (int) (Math.random() * passwordSet.length());
               password[1] = passwordSet.charAt(rand);
            }
            return  new String(password);
    }

    //set the mailbox capacity
        public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
        }
    //set the alternate email
    public void setAlternateEmail(String altEmail) {
            this.setAlternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password) {
            this.password = password;
    }
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return setAlternateEmail; }
    public String getPassword() { return password; }
    
    public String showInfo() {
        final String mb = "mb";
        return  "DISPLAY NAME " + firstName + "" + lastName +
                    "\nCOMPANY EMAIL: " + email +
                    "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb" ;
    }

}
