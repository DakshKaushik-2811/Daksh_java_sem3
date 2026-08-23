import java.util.*;
public class Thirty {
    public static void main (String[] args){  /// matrix operation
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();   
        int [][] number = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j < m; j++){
                number[i][j]=sc.nextInt();
            }
        }
        for(int j=0; j<m; j++){
            for(int i= 0; i < n; i++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}