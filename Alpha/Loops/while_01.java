import java.util.*;
public class while_01{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num) {
            System.out.println(i);
            i += 1;
        }
        sc.close();
    }
}