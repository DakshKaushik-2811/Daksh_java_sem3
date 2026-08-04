import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double feranite = celsius * 9.0 / 5.0 + 32.0;
         System.out.println("Temperature in Fahrenheit: " + feranite);
    }
}