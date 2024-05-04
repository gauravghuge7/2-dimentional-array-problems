import java.util.Scanner;

class main {

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++)  {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[3][3];

        int[][] array2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9} 
        };

        // this is not a method to initialize an array
        // array[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // this is a method to initialize an array
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         array[i][j] = scan.nextInt();
        //     }
        // }

        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9} 
        };
        
        printArray(array2);

    }
}