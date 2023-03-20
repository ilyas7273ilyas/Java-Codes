import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //int flag=0;
        boolean isPrime = true;
        for(int i=2; i < n/2; i++) {
            if(n%i==0) {
                //flag=1;
                isPrime = false;
                break;
            }
        }
        sc.close();
        //if(flag==1)
        if(isPrime == true) 
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number");
    }
}
