import java.util.Scanner;



public class spiralCreate {

    static void printMatrix(int[][] matrix) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(); 
        }
    }
    

    static int[][] generateSpiral(int n) {

        int[][] spiral = new int[n][n];


        int topRow=0, rightColumn=n-1, bottomRow=n-1, leftColumn=0;


        int totalNumber = n*n;
        int assignNumber = 1;

        while(assignNumber <= totalNumber) {

            // generate first top row values 

            for(int i=leftColumn; i<=rightColumn && assignNumber <= totalNumber; i++) {
                spiral[topRow][i] = assignNumber++;
            }
            topRow++;

            // generate the second right column 

            for(int j=topRow; j<=bottomRow && assignNumber <= totalNumber; j++) {
                spiral[j][rightColumn] = assignNumber++;
            }
            rightColumn--;

            // generate the third bottom row of the matrix spiral matrix

            for(int i=rightColumn; i>=leftColumn && assignNumber <= totalNumber; i--) {

                spiral[bottomRow][i] = assignNumber++;
            }
            bottomRow--;

            // generate the fourth left column of the spiral matrix

            for(int j=bottomRow; j>=topRow && assignNumber <= totalNumber; j--) {
                spiral[j][leftColumn] = assignNumber++;
            }
            leftColumn++;
        }
    
        return spiral;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number ");

        int n = scan.nextInt();

        int [][] matrix = generateSpiral(n);

        printMatrix(matrix);

    }
}
