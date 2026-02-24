package OopsConcept;

public class InheritanceConcepts {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
        f1.breathe();
        f1.color = "black";
        System.out.println(f1.color);
    }
}
// this is our parent class
class Animals{
    String color;
    void breathe(){
        System.out.println("breathe");
    }
    void eat(){
        System.out.println("eats");
    }
}
//this is our child class
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
