public class In_and_rotated_half_pyramid {

    public static void pyramid(int row) {
        for(int i=0;i<row;i++) {
            for(int j=0;j < row-i; j++)  {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(8);
    }
}
