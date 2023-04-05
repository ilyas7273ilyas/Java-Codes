import java.util.*;

public class hollow_rectangel {

    public static void hollow(int row, int column) {
        int i,j;
        //int arr[][];
        for(i=0;i<row;i++) {
            for(j=0;j<column;j++) {
                if(i == 0 || i == row-1 || j ==0 || j == column-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column of rectangle: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        hollow(row, column);
        
        sc.close();

    }
    

}