package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private String tuitionBalance;
    private  static int  costOfCourse =  600;
    private static int id = 1001;


    //Constructor:prompt user to enter student s name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - for Sophmore\n3 - Junior\n4 - SeniorEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + "" + lastName + "" + gradeYear + "" + studentID);


    }

    // Generate an ID
        private void setStudentID() {
        //Grade level + ID
            id++;
           this.studentID = gradeYear + "" + id;

        }
    // enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
       do {
           System.out.print("Enter course to enroll (0 to quit): ");
           Scanner in = new Scanner(System.in);
           String course = in.nextLine();
           if( !course.equals("Q")) {
               courses = courses + "\n" + course;
               tuitionBalance = tuitionBalance + costOfCourse;
           }
           else {
               System.out.println("BREAK!");
               break; }

            } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //View balance

    // Pay tuition

    //show status

}
