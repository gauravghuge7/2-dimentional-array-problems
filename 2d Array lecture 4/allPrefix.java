import java.util.Scanner;

/**
 * allPrefix
 */
public class allPrefix {

    static void printMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }


    public static int[][] prefixColumn(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0; i<r; i++) {
            for(int j=1; j<c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
        return matrix;
    }

    public static int[][] timePrefix(int[][] matrix, int r1, int c1, int r2, int c2) {
        int r = matrix.length;
        int c = matrix[0].length;

        prefixColumn(matrix);

        // for(int i=0; i<r; i++) {
        //     for(int j=1; j<c; j++) {
        //         matrix[j][i] += matrix[j-1][i];
        //     }
        // }

        for(int j=0; j<c; j++) {
            for(int i=1; i<r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }

        System.out.println("Printing the Array ");


        printMatrix(matrix);

        System.out.println("Displaying the Sum");

        //  start the calculating the value
        
        int sum =0;
        int count1 =0;
        int count2 =0;

        count2 = matrix[r2][c2] - matrix[r1-1][c2];
        count1 = matrix[r2][c1] - matrix[r1-1][c1];

        sum = count2 -count1;
        System.out.println("the Addition is "+ sum);

        return matrix;
    }

    public static int sum(int[][] matrix, int r1, int c1, int r2, int c2) {
        int r = matrix.length;
        int c = matrix[0].length;
        int sum =0;

            


        return sum;
    }

     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows and column "); 
        int r = scan.nextInt();
        int c = scan.nextInt();
        
        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+ " elements");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = scan.nextInt();

            }
        }

        System.out.println("Enter the co-ordinates");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        int r2 = scan.nextInt();
        int c2 = scan.nextInt();

        timePrefix(matrix, r1, c1, r2, c2);


    }
}