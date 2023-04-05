public class Construct {
    public static void main(String args[]) {
        Student s1 = new Student("Alpha");  // Object is created and Constructor is called
        System.out.println(s1.name);
        Student s2 = new Student(); 
        Student s3 = new Student(123);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {  // Parameterized Constructor
        this.name = name;
    }

    Student() {  // Non-parameterized /Default Constructor
        System.out.println("Constructor is called....");
    }

    Student(int roll) {
        this.roll = roll;
    }
}
