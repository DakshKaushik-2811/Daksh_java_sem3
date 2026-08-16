import java.util.*;

public class Seventh {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entermarks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println ("Excellent ");
        } 
        else if (marks >= 80) {
            System.out.println("Great");
        } 
        else if (marks >= 70) {
            System.out.println("nice");
        } 
        else if (marks >= 60) {
            System.out.println("can do better");
        } 
        else if (marks >= 50) {
            System.out.println("Fail ");
        } 
       
        sc.close();
    }
}