import java.util.ArrayList;

public class Pair_Sum_2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {  //breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest
        int n = list.size();

        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case 2
            else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }

            //case 3
            else {
                rp = (n+rp-1) % n;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        /// 11, 15, 6, 8, 10 -- Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
