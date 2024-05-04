import java.util.Scanner;

public class rotate {

    static void printArray(int[][] arr) {

        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static int[] reverseArray(int[] arr) {
        
        int i=0,j=arr.length-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        return arr;
    }


    static int[][] rotateArray(int[][] matrix) {

        for(int i=0; i<matrix.length; i++) {

            reverseArray(matrix[i]);
        }
        return matrix;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows and columns");
        int r = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Enter "+r*c +" Array Elements");
        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = scan.nextInt();
            }
        }


        int[][] ans = rotateArray(arr);

        System.out.println("rotating and Printing array");
        printArray(ans);
    }
}
