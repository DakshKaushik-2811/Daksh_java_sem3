import java.util.*;
public class ThirtyTwo {  // array transformation
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n= sc.nextInt();
        System.out.println("enetr the value of m : ");
        int m = sc.nextInt();
        int [][]number = new int[n][m];
        System.out.print("the matrix is : ");
        for(int i=0; i<n; i++){
            for (int j = 0; j<m; j++){ // user sai 2d array
                number[i][j] = sc.nextInt();
               // System.out.println(number[i][j]);
            }
            System.out.println();
        }
        System.out.println("choose the transformation in need : ");
        int transformation = sc.nextInt();
        switch(transformation){
            case 1:
                System.out.println("enter tyhe vaku of sum = ");
                int sum = sc.nextInt();
                for(int i =0; i<n; i++){
                    for(int j =0; j<m; j++){
                        number[i][j]= number[i][j] + sum;
                        System.out.print(number[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
                case 2:
                    System.out.println("enter the value of multiply : ");
                    int multiply = sc.nextInt();
                    for(int i=0; i<n; i++){
                        for(int j=0; j <m; j++){
                            number[i][j] =number[i][j] * multiply;
                            System.out.print(number[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                    default:
                System.out.println("Invalid transformation");
        }
    }
}