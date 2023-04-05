import java.util.*;
public class break_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the no: ");
            int n = sc.nextInt();
            if(n%10 == 0)
            break;
            System.out.println(n);
        }
        sc.close();
    }
}
