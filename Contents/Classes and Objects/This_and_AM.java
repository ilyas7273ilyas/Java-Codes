public class This_and_AM {
    public static void main(String args[]) {
        Pen1 p1 = new Pen1();  //Pen() is coustructor
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen1 {
    private String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;  // this is representing to color of this class
    }

    void setTip(int tip) {
        this.tip = tip;  // this is representing to tip of this class
    }
}
