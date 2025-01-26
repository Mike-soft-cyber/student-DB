import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int formYear;
    private String studentID;
    private String[] courses = {"history", "mathematics", "english", "chemistry", "biology"};
    private int courseCost = 600;
    private int balance = 0;
    private static int id = 1000;
    private String enrolledSubjects = "";

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name:" );
        firstName = in.nextLine();

        System.out.print("Enter student last name:" );
        lastName = in.nextLine();

        System.out.println("1. Form One\n2. Form Two\n3. Form Three\n4. Form Four");

        System.out.print("Enter student year:" );
        formYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " "+ lastName + " " +studentID);

    }

    private void setStudentID(){
        id++;
        studentID = formYear + "" + id;
    }

    public void enroll() {
        System.out.print("Enter courses to enroll: ");
        Scanner in = new Scanner(System.in);


            String en = in.nextLine().trim();

            String[] selected = en.split(",");
            System.out.println("SELECTED COURSES");

            for (String course : selected) {
                course = course.trim();

                if (Arrays.asList(courses).contains(course)) {
                    if (enrolledSubjects.length() > 0){
                        enrolledSubjects += ", ";
                    }
                    enrolledSubjects += course;
                    System.out.println(course);
                    balance += courseCost;
                } else {
                    System.out.println("Course not found");
                }
            }
            viewBalance();
        }

        public void viewBalance(){
        System.out.println("Your balance is $"+balance);
        }

        public void tuitionPayment(){
        System.out.print("Enter payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        balance -= payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
        }

        public void showInfo(){
        System.out.println("        STUDENT INFO      ");
        System.out.println("Name: "+firstName + " " + lastName);
        System.out.println("Form "+formYear);
        System.out.println("Student ID: "+studentID);
        System.out.println("Subjects: "+enrolledSubjects);
        System.out.println("Tuition Balance: $"+balance);
        }
    }
