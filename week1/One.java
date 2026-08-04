import java.util.*;
public class One {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();
        switch(number){
            case 1 :
                int sum= a+b;
                System.out.println(sum);
                break;
            case 2 :
                int diff = a-b;
                System.out.println(diff);
                break;
            case 3 :
                int multiply = a*b;
                System.out.println(multiply);
                break;
            case 4 :
                int division = a/b;
                System.out.println(division);
                break;
            case 5:
                System.out.println("invalid button");

        }
    }
}
