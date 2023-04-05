public class Search {

    public static boolean statircaseSearch(int matrix[][], int key) {

        ////Starting point is top right
        //int row=0, col=matrix[0].length-1;  //Starting point is top right
        // while(row < matrix.length && col >= 0) {
        //     if(matrix[row][col] == key) {
        //         System.out.println("Found key at ("+row+","+col+")");
        //         return true;
        //     }

        //     else if(key < matrix[row][col]) {
        //         col--;
        //     }
        //     else {
        //         row++;
        //     }
        // }

        //Starting point is bottom left
        int row=matrix[0].length-1, col=0;  
        while(row >=0 && col < matrix.length) {
            if(matrix[row][col] == key) {
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }

            else if(key < matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

    statircaseSearch(matrix, 33);
    }
}
