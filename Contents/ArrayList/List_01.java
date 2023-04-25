import java.util.ArrayList;

public class List_01 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element  O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(4, 10); // O(n) 
        System.out.println(list);

        // Get Element  O(1)
        int element = list.get(4);
        System.out.println(element);

        //Remove Element  O(n)
        list.remove(4);
        System.out.println(list);

        //Set (Replace)  O(n)
        list.set(3, 10);
        System.out.println(list);

        //Contains (True or False) O(n)
        System.out.println(list.contains(12));
        System.out.println(list.contains(10));

        // Size function
        System.out.println("Size of ArrayList: " + list.size());

        //print the arraylist (iterations)
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}