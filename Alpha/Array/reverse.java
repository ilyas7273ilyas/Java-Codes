public class reverse {
    public static void Reverse(int numbers[]) {
        // for(int i=numbers.length-1;i>=0;i--) {
        //     System.out.println(numbers[i] + " ");
        // }

        int first=0, last=numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i] + " ");
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,3,4,90,76};
        Reverse(numbers);

        // for(int i=0;i<numbers.length;i++) {
        //     System.out.println(numbers[i] + " ");
        // }
    }
    
}
