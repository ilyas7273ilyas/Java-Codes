import java.util.*;

public class JavaBasics5{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        System.out.print("Enter Value of Input: ");
        String input = sc.nextLine();
        System.out.println(input);
        
        // System.out.println("Enter value of name: ");
        // String name = sc.nextLine();
        //System.out.println(name);

        // System.out.println(input);
        // System.out.println(name);

        System.out.print("Enter Value of number: ");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.print("Enter Value of price: ");
        float price = sc.nextFloat();
        System.out.println(price);
        

        sc.close();
    }
}