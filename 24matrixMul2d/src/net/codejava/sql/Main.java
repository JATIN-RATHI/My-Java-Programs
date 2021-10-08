package net.codejava.sql;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("---------------\n\tMatrix 1\n---------------\n");
        System.out.print("Enter number of row : ");
        int n = input.nextInt();
        System.out.print("Enter number of Column : ");
        int m = input.nextInt();
        int [][]mat1 = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                System.out.print("mat1[" + (i+1) + "]["+ (j+1) + "] = ");
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.println("---------------\n\tMatrix 2\n---------------\n");
        System.out.print("Enter number of row : ");
        int n1 = input.nextInt();
        System.out.print("Enter number of Column : ");
        int m1 = input.nextInt();
        int [][]mat2 = new int[n1][m1];
        for(int i = 0 ; i < n1 ; i++)
        {
            for(int j = 0 ; j < m1 ; j++)
            {
                System.out.print("mat1[" + (i+1) + "]["+ (j+1) + "] = ");
                mat2[i][j] = input.nextInt();
            }
        }

        int [][]prod = new int[n][m1];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m1; j ++)
            {
                for(int k = 0; k < n; k++)
                {
                    prod[i][j] = mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("\nProduct of Matrix 1 and Matrix 2 is ");
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m1; j ++)
            {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
