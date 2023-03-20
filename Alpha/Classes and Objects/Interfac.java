public class Interfac {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();   // Blueprint
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, digonal (in all dir) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down,Left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down,Left, right, diagonal - bt 1 step");
    }
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {    // Multiple Inheritance

}