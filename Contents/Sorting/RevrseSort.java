import java.util.Collections;
import java.util.Arrays;

public class RevrseSort {
    

    public static void printArr(Integer arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer arr[] = {5,4,2,1,3};
        printArr(arr);
        //Arrays.sort(arr, Collections.reverseOrder());  //RevrseOrder() works on Objects that why
                   // we need to use Integer instead of int

        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // 0 to 2
        printArr(arr);
    }
}
