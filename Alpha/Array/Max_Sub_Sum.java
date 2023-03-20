
    public class Max_Sub_Sum {
        public static void SubArr(int numbers[]) {
            int max=0;
            for(int i=0;i<numbers.length;i++) {
                int start = i;
                for(int j= i; j<numbers.length; j++) {
                    int end = j, sum=0;
                    for(int k=start;k<=end;k++) {  //Print
                        System.out.print(numbers[k] + " ");  //Subarray
                        sum = sum + numbers[k];
                        if(sum > max) {
                            max=sum;
                        }
                        // if(sum == 1) {
                        //     min = sum;
                        // }
                        // else if(sum < min) {
                        //     min = sum;
                        // }
                    }
                    System.out.print("  Sum= "+sum);
                    //ts++;
                    System.out.println();
                }
                System.out.println();
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
    
