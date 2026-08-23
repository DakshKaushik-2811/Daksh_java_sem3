import java.util.*;
public class ThirtyFive {
    public static void main(String[] args){  // array pointer
        int [] number = {1,2,3,4,5};
        for(int i = 0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        int [] arr = number;
        arr[0]= 100;
        for(int i = 0; i<number.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}