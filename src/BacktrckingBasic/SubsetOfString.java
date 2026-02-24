package BacktrckingBasic;

public class SubsetOfString {
    public static void FindSubset(String str , String ans, int i)
    {
        if(i == str.length())
        {
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }
            else {
                System.out.println(ans);
                return;
            }
        }
        FindSubset(str,ans+str.charAt(i),i+1);
        FindSubset(str, ans , i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubset(str , "" , 0);
    }
}
