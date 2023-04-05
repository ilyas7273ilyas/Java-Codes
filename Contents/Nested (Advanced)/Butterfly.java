public class Butterfly {

    public static void butter(int n) {
        int i,j,k,l;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(k=1;k<=2*(n-i);k++) {
                System.out.print(" ");
            }
            for(l=1;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=n;i>=1;i--) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(k=1;k<=2*(n-i);k++) {
                System.out.print(" ");
            }
            for(l=1;l<=i;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        butter(4);
    }
}
