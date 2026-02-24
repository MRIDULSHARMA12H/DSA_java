package OopsConcept;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer {
    void moves(); // this function by default public and  abstract and we not implement this function in interface
}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up , down , left , right , diagonal(in all 4 dirns)");
    }
}
class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up , down , left , right");
    }
}
class King  implements ChessPlayer {
    public void moves(){
        System.out.println("up , down , left , right , diagonal(by 1 step)");
    }
}
