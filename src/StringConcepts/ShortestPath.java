package StringConcepts;

import java.util.Scanner;

public class ShortestPath {
    public static float Shortpath(String path){
        int n = path.length();
        int x =0;
        int y =0;
        for(int i=0;i<n;i++){
            char dir = path.charAt(i);
            if(dir == 'n'){
                y++;
            }
            else if(dir == 's'){
                y--;
            }
            else if(dir == 'e'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        System.out.println(Shortpath(path));
    }
}
