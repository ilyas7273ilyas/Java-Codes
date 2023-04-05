public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();  //Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
    }

}


class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}