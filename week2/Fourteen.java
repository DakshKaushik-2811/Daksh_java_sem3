import java.util.*;

public class Fourteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int new_Value = n;

        System.out.println("Initial value = " + new_Value);

        new_Value = new_Value + 10;
        System.out.println("Addition = " + new_Value);

        new_Value = new_Value - 5;
        System.out.println("Difference = " + new_Value);

        new_Value = new_Value * 2;
        System.out.println("Multiply = " + new_Value);

        new_Value = new_Value / 5;
        System.out.println("Final value = " + new_Value);

        sc.close();
    }
}