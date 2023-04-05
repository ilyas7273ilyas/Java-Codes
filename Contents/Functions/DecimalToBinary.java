public class DecimalToBinary {
    public static void D2B(int decimal) {
        int input = decimal;
        int pow =0, binary = 0;
        
        while(decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int)Math.pow(10,pow));
            

            pow++;
            decimal = decimal/2;
        }

        System.out.println("Binary of: " + input + " = " + binary);
    }
    public static void main(String args[]) {
        D2B(12);
    }
}

