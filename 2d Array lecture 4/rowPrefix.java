import java.util.Scanner;

public class rowPrefix {


    static void findPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<r; i++) { 
            for (int j=1; j<c; j++) {
                matrix[i][j] += matrix[i][j-1];
            } 
        }
    }


    static int prefixOne(int[][] matrix, int r1, int c1, int r2, int c2) {
        int sum =0;
        findPrefixSum(matrix);

        for(int i=r1; i<= r2; i++) {

            // calculate the only value which we required

            if(r1>0)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];

        }



        return sum;
    }


    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rows and column");
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+" elements");

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter co-ordinates");
        int r1 = scan.nextInt(); 
        int c1 = scan.nextInt(); 

        int r2 = scan.nextInt(); 
        int c2 = scan.nextInt(); 

        int sum = prefixOne(matrix, r1, c1, r2, c2);

        System.out.println("Rectangle sum = "+sum);


    }
}
