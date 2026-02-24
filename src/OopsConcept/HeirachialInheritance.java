package OopsConcept;

public class HeirachialInheritance {
    public static void main(String[] args) {
        Mammals m1 = new Mammals();
        m1.eat();
        m1.color = "brown";
        System.out.println(m1.color);
        Fish f1 = new Fish();
        f1.eat();
        f1.swim();
        f1.color = "red";
        System.out.println(f1.color);

    }
}
class Animal {
    String color;
    void breathe(){
        System.out.println("breathe");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Fishs extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }

}
class Mammals extends Animal{
    int legs;
}
class birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
