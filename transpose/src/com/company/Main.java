package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter no. of rows : ");
        m = input.nextInt();
        System.out.println("Enter no. of columns : ");
        n = input.nextInt();
        int arr[][] = new int[m][n];
        int arr1[][] = new int[m][n];
        System.out.println("Enter elements of matrix:");
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.println("arr["+ i + "]" + "["+ j + "]" + " : ");
                arr[i][j]=input.nextInt();
                arr1[j][i] = arr[i][j];
            }
        }
        System.out.println("Matrix without transpose");
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print( "   " + arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after Transpose");
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print( "   " + arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
