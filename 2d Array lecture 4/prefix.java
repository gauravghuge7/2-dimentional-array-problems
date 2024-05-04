import java.util.Scanner;

class prefix {

    static int prefixSum(int[][] matrix, int r1, int c1, int r2, int c2) {

        int sum = 0;

       
        return sum;

    }


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows and columns");
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+" matrix Elements");

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }


        System.out.println("Enter first point a1, a2,");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        int r2 = scan.nextInt();
        int c2 = scan.nextInt();


        int sum = prefixSum(matrix, r1, c1, r2, c2);

        System.out.println(" the Sum is "+sum);



    }
}