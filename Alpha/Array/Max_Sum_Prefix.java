
public class Max_Sum_Prefix {
    public static void SubArr(int numbers[]) {
        int max=0;
        int prefix[] = new int[numbers.length];

        //Calculate prefix
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        

        for(int i=0;i<numbers.length;i++) {
            int start = i;
            for(int j= i; j<numbers.length; j++) {
                int end = j, sum=0;

                sum = start==0 ? prefix[sum] : prefix[end]-prefix[i-1];
        
                if(sum > max) {
                    max=sum;
                }
                    
                // }
                //System.out.print("  Sum= "+sum);
                //ts++;
                //System.out.println();
            }
            //System.out.println();
        }
        //System.out.println("Total Subarrays: " + ts);
        System.out.println("Maximum sum of a subarray= " + max);
        //System.out.println("Minimum sum of a subarray= " + min);
    }
    
    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        SubArr(numbers);
    }
    
}

