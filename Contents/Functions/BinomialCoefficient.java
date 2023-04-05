public class BinomialCoefficient {
    public static int fact(int n) {
        int f = 1;
        for (int i=1;i<=n;i++) {
            f=f*i;
        }
        return f;
    }

    public static int nCr(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int res = fact_n / (fact_r*fact_nmr);
        return res;
    }

    public static void main(String args[]) {
        int n = 5;
        int r = 3;

        System.out.println("Binomial Coefficient: "+ nCr(n, r));
    }
    
}
