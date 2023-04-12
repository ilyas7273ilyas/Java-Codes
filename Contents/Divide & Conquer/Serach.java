public class Serach {

    public static int search(int arr[], int tar, int si, int ei) {

        // base case
        if(si > ei) {
            return -1;
        }
        
        // Approach
        int mid = si + (ei-si)/2;  //(si+ei)/2

        //case found
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]) {
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }

            //case b: right
            else {
                return search(arr, tar, mid+1, ei);
            } 

        }

        //mid on L2
        else {
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }

            //case d: left
            else {
                return search(arr, tar, si, mid-1);
            }

        }
    }
    public static void main(String arg[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;  // output --> 4
        int tarIdx = search(arr, target, 0 ,arr.length-1);
        System.out.println(tarIdx);
    }
}
