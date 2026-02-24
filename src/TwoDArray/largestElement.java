package TwoDArray;

import java.util.Scanner;

public class largestElement {
    public static int FindLagest(int[][] arr, int n , int m)
    {
        int max = arr[0][0];
        for(int i = 0 ; i< n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] [] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(FindLagest(arr,n,m));
    }
}
