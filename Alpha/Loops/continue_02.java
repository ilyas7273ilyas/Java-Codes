
import java.util.*;
public class continue_02{
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Enter the no: ");
                int n = sc.nextInt();
                if(n%10 == 0)
                continue;
                System.out.println("Your number was: "+n);
            } while(true);
            //sc.close();
        }
}
