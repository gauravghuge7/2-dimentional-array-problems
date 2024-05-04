import java.util.Scanner;

public class sum {
    
    public static int addition(int[][] matrix, int r1, int c1, int r2, int c2) {
        int sum =0; 

            for(int i=r1; i<=r2; i++) {
                for(int j=c1; j<=c2; j++) {
                    sum = sum + matrix[i][j];
                }
            }


        return sum;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };

        System.out.println("Enter the co-ordinates");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();


        

       int sum = addition(matrix, r1, c1, r2, c2);
        System.out.println("Sum is "+sum);
    }
}
