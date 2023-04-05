import java.util.*;
public class fn_01 {
    public static void hello() {
        System.out.println("Hello World");
        return;
    }

    public static int cal(int a, int b) {
        int sum = a+b;
        return sum;
    }

public static void main(String args[]) {
hello();
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
cal(a,b);
System.out.println("Sum is: "+cal(a,b));
}
}
