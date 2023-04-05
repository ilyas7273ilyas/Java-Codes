public class FLOYD_Tri {
    public static void floyd(int n) {
        int a=0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(++a + " ");
                //a+=1;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyd(5);
    }
}
