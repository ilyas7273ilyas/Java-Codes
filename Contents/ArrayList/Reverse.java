import java.util.ArrayList;

public class Reverse {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.size());

        //Reverse list   --- O(n)
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
