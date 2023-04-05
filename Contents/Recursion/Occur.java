public class Occur {
    
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n)  { //O(logn)
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
