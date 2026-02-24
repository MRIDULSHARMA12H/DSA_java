package OopsConcept;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "green";  // this is because my properties are public.
        System.out.println(p1.color);

    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
