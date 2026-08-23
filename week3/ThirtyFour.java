import java.util.*;
public class ThirtyFour{
    public static void main (String[] args){  // array construction
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
          System.out.println("enter the value of m : ");
        int m = sc.nextInt();
        int [][] number = new int[n][m];
         System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("the final matrix is : ");
        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}