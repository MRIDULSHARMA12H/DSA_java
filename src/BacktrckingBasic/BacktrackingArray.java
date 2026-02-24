package BacktrckingBasic;

public class BacktrackingArray {
    public static void ChangeArray(int[] arr , int i , int val )
    {
        if(i == arr.length)
        {
            PrintArr(arr);
            return;
        }
        arr[i] = val;
        ChangeArray(arr,i+1,val+1);
        arr[i] = arr[i] -2;
    }
    public static void PrintArr(int[] arr)
    {
        for(int i=0 ; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        ChangeArray(arr,0,1);
        PrintArr(arr);
    }
}
