import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of students to enroll:");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();

        Student[] newStudent = new Student[numStudents];

        for (int i = 0; i < numStudents; i++){
            newStudent[i] = new Student();
            newStudent[i].enroll();
            newStudent[i].tuitionPayment();
            newStudent[i].showInfo();
        }
    }
}
