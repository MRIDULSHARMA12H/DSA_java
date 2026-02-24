package OopsConcept;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setcolor("blue");
        p1.settip(5);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        p1.setcolor("red");
        System.out.println(p1.getcolor());
    }
}
class Pens{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String color){
        this.color = color;
    }
    void settip(int tip){
        this.tip = tip;
    }
}
