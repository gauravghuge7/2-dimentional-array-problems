import java.util.Scanner;

class spiral {

    static void printMatrix(int[][] matrix) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int[][] spiralMatrix(int[][] matrix, int r, int c) {

        int toprow=0, rightcolumn=c-1, 
            bottomRow=r-1, leftcolumn=0
        ;

        int allElement = r*c;

        int totalElement=0;


        while(totalElement < allElement) {

            // first top row printing
            
            for(int i=leftcolumn; i<=rightcolumn && totalElement < allElement; i++) {
                System.out.print(matrix[toprow][i]+" ");
                totalElement++;
            }
            toprow++;
            System.out.println();
            // second right column printing

            for(int j=toprow; j<=bottomRow && totalElement < allElement; j++) {
                System.out.print(matrix[j][rightcolumn]+" ");
                totalElement++;
            }
            rightcolumn--;
            System.out.println();

            // third bottom row printing 

            for(int i=rightcolumn; i>=leftcolumn && totalElement < allElement; i--) {

                System.out.print(matrix[bottomRow][i]+" ");
                totalElement++;
            }
            bottomRow--;
            System.out.println();

            // fourth left row printing 

            for(int j=bottomRow; j>=toprow && totalElement < allElement; j--) {
                System.out.print(matrix[j][leftcolumn]+" ");
                totalElement++;
            }
            leftcolumn++;

            System.out.println();
        }
        

        return matrix;
    }



    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows and columns of matrix");
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+"elements");

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Printing the Array");

        int[][] spiral = spiralMatrix(matrix, r, c);

        

    }
}