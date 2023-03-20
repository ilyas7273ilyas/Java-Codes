//import java.util.Scanner;

public class String_01 {

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";  //Method 1
        // String str2 = new String("xyz@#$@%#"); //Method 2

        // //Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // //name = sc.next(); // Single Word
        // name = sc.nextLine(); // Multiple words
        // System.out.print(name);

        //Length of String
        // String fullName = "Lionel Messi";
        // System.out.println(fullName.length());

        //Concatenation
        String firstName = "Lionel";
        String lastName = "Messi";
        String fullName =firstName + " " + lastName;
        System.out.println(fullName);

        //charAt()
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(5));

        printLetters(fullName);
    }
}