public class Stati {
    public static void main(String args[]) {
        Student22 s1 = new Student22();
        s1.schoolname = "PGS";

        Student22 s2 = new Student22();
        System.out.println(s2.schoolname);

        Student22 s3 = new Student22() ;
        s3.schoolname = "ABC";

        System.out.println(s1.schoolname);

    }
}

class Student22 {

    int returnPercentage(int math, int phy, int chem) {
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolname; 

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

