import java.util.*;

public class Fifteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter english marks: ");
        int english = sc.nextInt();

        System.out.print("Enter hindi marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter marhs marks: ");
        int science = sc.nextInt();

        System.out.print("Enter science marks: ");
        int computer = sc.nextInt();

        System.out.print("Enter computer marks: ");
        int hindi = sc.nextInt();

        int total = english + hindi + maths + science + computer;  // total marks

        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade = A1");
        }
        else if (percentage >= 80) {
            System.out.println("Grade = A2");
        }
        else if (percentage >= 70) {
            System.out.println("Grade = b1");
        }
        else if (percentage >= 60) {
            System.out.println("Grade = b2");
        }
        else if (percentage >= 50) {
            System.out.println("Grade = c1");
        }
        else if (percentage >= 40) {
            System.out.println("Grade = D");
        }
        else {
            System.out.println("Grade = F");
        }

        sc.close();
    }
}