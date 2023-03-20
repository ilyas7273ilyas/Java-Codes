public class SpiralMat {

    public static void printSpiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // Top
            for(int j=startCol ; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            // Right
            for(int i=startRow+1 ; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            // Bottom
            for(int j=endCol-1 ; j>=startCol; j--) {
                if(startRow == endRow) {   // If order of matrix is odd and also 
                    break;                 // If only one row is in matrix
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            // Left
            for(int i=endRow-1 ; i>=startRow+1; i--) {
                if(startCol == endCol) {  // If order of matrix is odd and also
                    break;              // If only one column is in matrix
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8}};

        //int matrix[][] = {{1,2,3,4}};

        // int matrix[][] = {{1},
        //                   {5},
        //                   {9},
        //                   {13}};

        // int matrix[][] = {{1,2,3},
        //                    {5,6,7},
        //                    {9,10,11}};

        printSpiral(matrix);

    }
}
