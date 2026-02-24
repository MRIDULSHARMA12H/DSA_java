package Recursion;

public class FirstOccureunce {
    public static int Occurence(int [] arr , int i , int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
         return Occurence(arr, i+1 , key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,2,3,9,8,9,5,6,7,3};
        System.out.println(Occurence(arr,0,26));
    }
}
