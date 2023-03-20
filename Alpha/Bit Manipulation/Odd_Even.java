public class Odd_Even {
    public static void OddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //Even
            System.out.println("Even Number");
        }
        else {
            // Odd
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]) {
        OddEven(3);
        OddEven(11);
        OddEven(8);
    }
}
