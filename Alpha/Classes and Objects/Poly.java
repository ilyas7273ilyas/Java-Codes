public class Poly {
    public static void main(String args[]) {
        // Method Overloading
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum((float)2.5, (float)5.3));
        System.out.println(cal.sum(5,2,9));

        // Method Overriding
        Deer dr = new Deer();
        dr.eat();
    }
}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    float sum(int a, int b, int c) {
        return a+b+c;
    }
}

// Method Overriding
class Animals {
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Deer extends Animals {
    void eat() {
        System.out.println("Eats Grass");
    }
}