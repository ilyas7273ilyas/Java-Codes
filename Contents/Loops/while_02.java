import java.util.*;
public class while_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=num) {
            sum += i;
            i += 1;
        }

        System.out.println("Sum of Series: " + sum);
        sc.close();
    }
}
