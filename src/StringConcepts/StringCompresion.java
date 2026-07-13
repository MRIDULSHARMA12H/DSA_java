package StringConcepts;

import java.util.Scanner;

public class StringCompresion {
    public  static String Compression(String str) {
        StringBuilder s = new StringBuilder();
        int n= str.length();
        for(int i =0; i<n ; i++){
            Integer count = 1;
            while(i < n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if(count >1){
                s.append(count);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Compression(str));
    }
}
