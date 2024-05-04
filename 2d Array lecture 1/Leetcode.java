import java.util.*;
class Leetcode {
    public static int[][] transpose(int[][] matrix, int m, int n) {
        
        
        
        
        int ans[][] = new int[n][m];
        

        for (int i=0; i<n; i++) {
            
            
            for(int j=0; j <m; j++) {

                ans[i][j] = matrix[j][i];

            }
        }
        return ans;
    }


    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] arr = new int[m][n];


        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }



        int[][] ans1 = transpose(arr, m, n);

        for(int i=0; i<m; i++) {

            for (int j=0; j<n; j++) {
                System.out.print(ans1[i][j]+" ");
            }
            System.out.println();
        }

    }
}