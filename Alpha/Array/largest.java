//import java.util.*;
public class largest {

    public static int max(int numbers[]) {
        int largest = Integer.MIN_VALUE;  //Upto infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest valur is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,5,6,8};
        System.out.println("Largest Number is: " + max(numbers));
    }
}
