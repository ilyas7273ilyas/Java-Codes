//import java.util.*;
public class swap {
    public static void op(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a in function op: " + a);
        System.out.println("Value of b in function op: " + b);
    }

    public static int cal(int a, int b) {
        int sum = a+b;
        return sum;
    }

public static void main(String args[]) {

//Scanner sc = new Scanner(System.in);
int a = 5; //sc.nextInt();
int b = 10; //sc.nextInt();
//cal(a,b);
op(a,b);   //Copy  #Call by Value
System.out.println("Value of a in function main: " + a);
System.out.println("Value of b in function main: " + b);
}
}
