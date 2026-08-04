import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = principal * rate * time / 100;

        double finalAmount = principal + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Final Amount = " + finalAmount);
    }
}