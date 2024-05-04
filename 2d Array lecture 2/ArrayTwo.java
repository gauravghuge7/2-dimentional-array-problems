import java.util.Scanner;

public class ArrayTwo {


    static int[][] printArray(int[][] arr) {

        int n = arr.length;

        for(int i=0; i<n; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        return arr;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter the first matrix number of rows and columns");

        // int r1 = scan.nextInt();
        // int c1 = scan.nextInt();
        // int[][] arr = new int[r1][c1];

        // System.out.println("Enter elements of array");
        // for(int i = 0; i < r1; i++) {
        //     for(int j=0; j < c1; j++) {
        //         arr[i][j] = scan.nextInt();
        //     }
        // }

        System.out.println("Enter the second matrix number of rows and columns");

        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter elements of array");
        for(int i = 0; i < r2; i++) {
            for(int j=0; j < c2; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }


        System.out.println();
        System.out.println();
        System.out.println();

        printArray(arr2);


    }
}
