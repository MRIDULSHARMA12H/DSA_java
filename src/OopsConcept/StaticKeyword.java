package OopsConcept;

public class StaticKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Mridul");
        System.out.println(s1.getName());
        s1.schoolname = "APS";  // this static schoolname for all the Students object
        System.out.println(s1.schoolname);
        Students s2 = new Students();
        System.out.println(s2.schoolname);
    }
}
class Students {
    String name;
    int rollno;
    static String schoolname;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setRollno(int rollno){
        this.rollno = rollno;
    }
    int getRollno(){
        return this.rollno;
    }
}
