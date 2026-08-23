import java.util.*;
public class ThirtyThree{  // matrix operation...
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] number = {{1,2,3},{4,5,6}};
        for(int i=0; i<number.length; i++){
            for(int j= 0; j<number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arr = {{7,8,9},{10,11,12}};
        for(int i=0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("the final result is : ");
        int[][] result = new int[number.length][number.length];
        for(int i =0; i<number.length; i ++){
            for(int j=0; j<number[i].length; j++){
                result[i][j] = number[i][j] + arr[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}