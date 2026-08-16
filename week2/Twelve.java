import java.util.*;

public class Twelve{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int number  = n % 10;  
            number= number * 10 + reverse;
            n = n / 10; // removes decimal part
        }

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}