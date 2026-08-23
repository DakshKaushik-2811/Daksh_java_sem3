import java.util.*;
public class ThirtyOne {  // array statics...
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter your choice = ");
        int choice = sc.nextInt();
        switch(choice) {
        case 1 : 
        int sum =0;
        for(int i =0; i<size; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum );
        break;

        case 2 :
            int difference =0;
            for(int i =0; i< size; i++) {
                difference = difference - arr[i];
            }
            System.out.println(difference );
            break;

        case 3 : 
        int multiply =1;
        for(int i = 0; i< size; i++){
            multiply = multiply *arr[i];
        }
        System.out.println(multiply );
        break;
    case 4:
        int total = 0;
    for(int i = 0; i<size; i++) {
        total = total+ arr[i];

    }int average = total / size;
System.out.println(average );
break;}
    }
}