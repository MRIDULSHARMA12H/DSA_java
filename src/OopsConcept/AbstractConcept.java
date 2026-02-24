package OopsConcept;

public class AbstractConcept {
    public static void main(String[] args) {
//        Horse hr = new Horse();
//        hr.eat();
//        hr.walk();
//        chicken ch = new chicken();
//        ch.eat();
//        ch.walk();
        Mustang mg = new Mustang();
    }
}

abstract  class Animaless {
    Animaless() {
        System.out.println("Animaless constructor called.");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animaless {
    Horse(){
        System.out.println("horse constructor called.");
    }
    void walk(){
        System.out.println("walk with 4 legs.");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("mustang constructor called.");
    }
}
class chicken extends Animaless {
    void walk(){
        System.out.println("walks with 2 legs.");
    }
}
