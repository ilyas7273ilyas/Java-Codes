public class BinaryToDecimal {
    public static void B2D(int binary) {
        int input = binary;
        int pow =0, decimal = 0;
        
        while(binary > 0) {
            int lastdigit = binary%10;
            decimal = decimal + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binary = binary/10;
        }

        System.out.println("Decimal of: " + input + " = " + decimal);
    }
    public static void main(String args[]) {
        B2D(1000);
    }
}
