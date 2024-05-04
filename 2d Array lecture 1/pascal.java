import java.util.Scanner;

public class pascal {
    
    static int[][] createPascal(int n) {

        int ans[][] = new int[n][];
        
        for(int i=0; i<n; i++) {
            ans[i] = new int[i+1];

            for(int j=1; j<i; j++) {
                
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }

        }

        return ans;
    }


    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);

       System.out.println("Enter number for Array");
        int n = scan.nextInt();

        int[][] arr = createPascal(n);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
