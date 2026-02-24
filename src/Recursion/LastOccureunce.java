package Recursion;

public class LastOccureunce {
    public static int Last(int [] arr , int i , int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
        int isFound = Last(arr ,i+1, key);
        if(isFound != -1)
        {
            return isFound;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,5,3,4,6,7,5,6,7};
        System.out.println(Last(arr, 0 , 5));
    }
}
