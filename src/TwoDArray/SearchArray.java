package TwoDArray;

import java.util.Scanner;

public class SearchArray {
    public static void Findkey(int[][] arr , int key , int n , int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.println(i + " " + j);
                    return ;

                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int [n] [m];

        for(int i = 0 ; i<n ; i++)
        {
            for(int j =0 ; j< m ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        Findkey(arr ,7 , n , m);
    }
}
