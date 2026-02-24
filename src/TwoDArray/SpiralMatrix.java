package TwoDArray;

import java.util.Scanner;

public class SpiralMatrix {
    public static void Spiral(int[] [] matrix)
    {
        int Startrow = 0;
        int Startcol = 0;
        int endrow = matrix.length -1;
        int endcol = matrix[0].length -1;
        while(Startrow <= endrow && Startcol <= endcol)
        {
//            top
            for(int j = Startcol ; j<= endcol; j++)
            {
                System.out.print(matrix[Startrow][j] + " ");
            }
//            right
            for(int i = Startrow+1 ; i<= endrow; i++)
            {
                System.out.print(matrix[i][endcol] + " ");
            }
//            bottom
            for(int j = endcol-1 ; j>= Startcol;j--)
            {
                System.out.print(matrix[endrow][j] + " ");
            }
//            left
            for(int i = endrow-1 ; i>= Startrow+1 ; i--)
            {
                System.out.print(matrix[i][Startcol] + " ");
            }
            Startrow++;
            Startcol++;
            endrow--;
            endcol--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int [4][4];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i< n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
//        for(int i = 0 ; i< n ; i++)
//        {
//            for(int  j = 0 ; j < m ; j++)
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//        }
        Spiral(matrix);
    }
}
