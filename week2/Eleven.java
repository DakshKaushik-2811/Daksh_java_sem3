import java.util.*;

public class Eleven{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        int divisor = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        System.out.println("Greatest_Common_Divisor = " + divisor);

        sc.close();
    }
}