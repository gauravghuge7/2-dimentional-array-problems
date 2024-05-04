import java.util.Scanner;

class transpose {

    static void printMatrix(int[][] matrix) {

        for(int i=0; i<matrix.length; i++) { // rows that vertical 
            for(int j=0; j<matrix[i].length; j++) {  // columns thats horizontal

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int[][] transposeMatrix(int[][] matrix, int r, int c) {

        int ans[][] = new int[c][r];
        
        for(int i=0; i<c; i++) { 

            for (int j=0; j<r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }

    static void easyTranspose(int[][] arr, int r, int c) {


        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;

                arr[i][j] = arr[i][j] + arr[j][i];
               //  a      =    a      +   b 
                arr[j][i] = arr[i][j] - arr[j][i];
                // b      =     a     -   b
                arr[i][j] = arr[i][j] - arr[j][i];
                //  a     =   a      -    b

            }
        }
    }

    static void transposeWithOnlyArr(int[][] arr, int r, int c) {

        
        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;

                arr[i][j] = arr[i][j] + arr[j][i];
               //  a      =    a      +   b 
                arr[j][i] = arr[i][j] - arr[j][i];
                // b      =     a     -   b
                arr[i][j] = arr[i][j] - arr[j][i];
                //  a     =   a      -    b

            }
        }
    }



    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rows of column");
        int r = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Enter "+r*c+" elements ");
        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = scan.nextInt();    
            }
        }


        // int[][] ans = transposeMatrix(arr, r, c);

        easyTranspose(arr, r, c);

        System.out.println("printing the matrix");
        printMatrix(arr);

    }
}