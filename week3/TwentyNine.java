import java.util.*;
public class TwentyNine {   /// linear search.....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] number = new int [rows][columns];
        // nput of number
        for(int i=0; i<rows; i++){
            for(int j=0; j <columns; j++){
                 number[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();
        for(int i=0; i< rows; i++){
            for(int j=0; j<columns; j++){
                if(number [i][j] == x){
                    System.out.println("row " + i + "columns " + j);  // here + is used insted of coma
                }
            }
        }
    }
}