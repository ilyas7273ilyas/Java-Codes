public class Copy_const {
    public static void main(String args[]) {
        Student1 s1 = new Student1();
        s1.name = "Alpha";
        s1.roll = 45;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 50;
        for(int i=0;i<3;i++) {
            System.out.println(s2.marks[i]);
        }
    }
}


class Student1 {
    String name;
    int roll;
    String password;
    int marks[];
    
    // Shallow Copy Constructor
    // Student1(Student1 s1) {  // It don't get actualt value, 
    //     marks = new int[3];  // it just get reference of elements
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student1(Student1 s1) {  
        marks = new int[3];  
        // this.name = s1.name;
        // this.roll = s1.roll;
        for(int i=0;i<marks.length;i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Student1(String name) {  // Parameterized Constructor
    //     marks = new int[3];
    //     this.name = name;
    // }

    Student1() {  // Non-parameterized /Default Constructor
        System.out.println("Constructor is called....");
        marks = new int[3];
    }

    // Student1(int roll) {
    //     marks = new int[3];
    //     this.roll = roll;
    // }
}