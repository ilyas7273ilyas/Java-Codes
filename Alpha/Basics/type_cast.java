public class type_cast {
    public static void main(String args[]) {
        //Type Conversion
        // int a = 25;
        // long b = a;
        // char ch ='a';
        // char ch2 = 'b';
        // int num = ch;
        // int num2 = ch2;    
        // long a = 25;
        // int b = a;

        //Type Casting
        // float f = 25.12f;
        // int i = (int) f;

        // int marks = (int) (99.9999f);

        //char ch = 'a';
        // int number = ch;
        // System.out.println(number);

        // System.out.println(i);
        // System.out.println(marks);

        // System.out.println(num);
        // System.out.println(num2);



        //Type Promotion
        // char a = 'a';
        // char b = 'b';
        // short d = 50;
        // int c = a + d;
        // System.out.println(c);
        // //char c = a - b;   //Error
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println((int)(b-a));
        // System.out.println((a));


        // int  a = 10;
        // float b = 20.25f;
        // long c = 30;
        // double d = 30;
        // //int ans = a + b + c + d;   //wrong
        // //int long = a + b + c + d;  //wrong
        // double ans = a + b + c + d;   //Right
        // System.out.println((ans));

        byte b = 5;
        //byte a = (b * 2);   //wrong
        byte a = (byte)(b * 2);   //Right
        System.out.println((a));


    }
}