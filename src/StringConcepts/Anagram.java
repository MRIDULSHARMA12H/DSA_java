package StringConcepts;
import java.util.*;
public class Anagram {
    public static boolean checkAnagrams(String str, String str2) {
        if(str.length() != str2.length()) return false;
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        for(int i = 0; i<str.length(); i++) {
            m1.put(str.charAt(i),m1.getOrDefault(str.charAt(i),0)+1);
            m2.put(str2.charAt(i),m2.getOrDefault(str2.charAt(i),0)+1);
        }
        return m1.equals(m2);
    }
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";
        System.out.println(checkAnagrams(str,str2));
        System.out.println(checkAnagrams2(str,str2));
    }

//    Optimize solution
    public static boolean checkAnagrams2(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int [] count = new int[26];
        for(int i = 0;i<n1;i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }

        for(int i = 0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
