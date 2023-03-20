public class DiagonalSum {
    public static void Diagonal(int matrix[][]) {
        int sum=0;

        // //Brute Force Method  O[n^2]
        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;j<matrix[0].length;j++) {
        //         if(i==j) {
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Sum of Diagonal Elements(Brute Force approach): "+sum);

        //Optimized  O[n]
        for(int i=0;i<matrix.length;i++) {
            // Primary Diagonal
            sum +=matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length-1-i) {  // To avoid overlapping of middle item
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Sum of Diagonal Elements(Optimized Approach): "+sum);

        //return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        // int matrix[][] = {{1,2,3},
        //                   {5,6,7},
        //                   {9,10,11}};

        Diagonal(matrix);
    }
}
