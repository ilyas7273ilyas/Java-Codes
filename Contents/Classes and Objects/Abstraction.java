public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animel {   //Abstract Class
    String color;

    Animel() {   //Constructor
        System.out.println("Animal Constructor");
        color = "Brown";
    }
    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();  //Abstract Method
}

class Horse extends Animel {

    Horse() {   //Constructor
        System.out.println("Horse Constructor");
    }
    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {  //Constructor
        System.out.println("Mustang Constructor");
    }
}

class Chicken extends Animel {

    Chicken() {   //Constructor
        System.out.println("Chicken Constructor");
    }
    void changeColor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}