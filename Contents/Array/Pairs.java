public class Pairs {
    public static void pairs(int numbers[]) {
        int tp=0;
        for(int i=0;i<numbers.length;i++) {
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs= " + tp);
    }

    public static void main(String args[]) {
        int numbers[] = {5,6,3,8,10,22};

        pairs(numbers);
    }
}
