package EmailApp;

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

    // constructor to receive  the first name and last name

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("EMAIL CREATED" + this.firstName + "" + this.lastName);

            //call a method asking for department  - return the department
            this.setDepartment = setDepartment();
            System.out.println("Department: " + this.department);

            // call a method that return a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println("Your Password is: " + this.password);
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

    //set the alternate email

    //change the password
}
