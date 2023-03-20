public class Inheri {
    public static void main(String args[]) {

        // Single level inheritance
        Fish shark = new Fish();
        shark.eat();

        // Multi level inheritance
        Dog dobby = new Dog();
        dobby.breath();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}


//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

// Single level inheritance
//Dervied Class /Child Class /Subclass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

//Multilevel Inheritance
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}