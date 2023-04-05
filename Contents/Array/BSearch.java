public class BSearch {
    public static int BinarySearch(int numbers[], int key) {
    int start=0, end=numbers.length, mid;
        for(int i=0;i<numbers.length-1;i++) {
            mid = (start + end)/2;
            if(numbers[mid] == key) {
                return mid;
                }
            if(numbers[mid] < key) {
                start = mid-1;
            }
            else {
                end = mid+1;
            }
            }
    
         return -1;
        }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 11;
    
        int index = BinarySearch(numbers, key);
    
        if(index == -1) {
            System.out.println("Not Found");
            }
        else {
            System.out.println("Found at index " + index);
            }
        }
}
    
