package OopsConcept;

public class HybridInInheritance {
    public static void main(String[] args) {
        Cats c1 = new Cats();
        c1.eat();
        c1.walk();
        c1.color = "Black";
        System.out.println(c1.color);
        c1.legs =4;
        System.out.println(c1.legs);
    }
}
class Animalss {
    String color;
    void breathe(){
        System.out.println("breathe");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Fishss extends Animalss{
    int finsh;
}
class Birds extends Animalss{
    int wings;
}
class Humans extends Animalss{
    void walk(){
        System.out.println("walks");
    }
}
class Mammalss extends Humans{
    int legs;
}
class Dog extends Mammalss{
    String breeds;
}
class Cats  extends Mammalss{
    void play(){
        System.out.println("cats");
    }
}