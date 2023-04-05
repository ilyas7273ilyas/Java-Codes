public class Super {
    public static void main(String args[]) {
        Horses h1 = new Horses();
        System.out.println(h1.color);
    }
}

class Animels {
    String color;
    Animels() {
        System.out.println("Animal Constructor is called");
    }
}

class Horses extends Animels {
    Horses() {
        super();
        super.color = "Green";
        System.out.println("Horse Constructor is called");
    }
}