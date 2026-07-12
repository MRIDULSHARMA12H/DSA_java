package StringConcepts;

import java.util.Scanner;

public class FindVowel {
    public static boolean isVowel(char ch) {
        if(ch=='a'|| ch =='e' || ch =='i'||ch =='o'||ch =='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i= 0; i<str.length();i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
