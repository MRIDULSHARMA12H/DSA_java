package StringConcepts;

public class Builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for(char i = 'a'; i<='z' ; i++){
            s.append(i);
        }
        System.out.println(s);
    }
}
