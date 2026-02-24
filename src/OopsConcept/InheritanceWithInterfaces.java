package OopsConcept;

public class InheritanceWithInterfaces {
    public static void main(String[] args) {
        Bear be  = new Bear();
        be.grass();
        be.meat();
    }
}
interface Herbivore{
    void grass();
}
interface Carnivore{
    void meat ();
}

class Bear implements Herbivore , Carnivore{
    public void meat(){
        System.out.println("they eat meat");
    }
    public void grass(){
        System.out.println("they eat grass");
    }
}