public class Rec_01 {

    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n +  " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int Sn = n + sum(n-1);
        return Sn;
    }
    public static void main(String args[]) {
        int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(5));
        System.out.println(sum(n));
    }
}