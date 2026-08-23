import java.util.*;
public class ThirtySix {
    boolean isOdd(int number) { // bit mask utility....
        return (number & 1) != 0;
    }
    int countSetBitsShift(int number) {
        int count = 0;
        for (int i =0; i < 32; i++) {
            if ((number & 1) != 0) {
                count++;
            }
            number = number >>> 1;
        }
        return count;
    }
    int countSetBitsFast(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }
    boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThirtySix obj = new ThirtySix();
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Check Odd or Even");
        System.out.println("2. Count Set Bits using Shift");
        System.out.println("3. Count Set Bits using Fast Method");
        System.out.println("4. Check Power of Two");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                if (obj.isOdd(number)) {
                    System.out.println("Number is Odd");
                } else {
                    System.out.println("Number is Even");
                }
                break;

            case 2:
                System.out.println("Set bits = " + obj.countSetBitsShift(number));
                break;

            case 3:
                System.out.println("Set bits = " + obj.countSetBitsFast(number));
                break;

            case 4:
                if (obj.isPowerOfTwo(number)) {
                    System.out.println("Number is a power of two");
                } else {
                    System.out.println("Number is not a power of two");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}