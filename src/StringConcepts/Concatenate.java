package StringConcepts;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  firstName = "Mridul";
        String lastName = "Sharma";
        String fullName = firstName+" "+lastName;
//        System.out.println(fullName);
//      charAt method
        String str = sc.nextLine();
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
