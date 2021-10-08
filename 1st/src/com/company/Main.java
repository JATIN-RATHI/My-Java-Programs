package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your size of array. : ");
        int size = input.nextInt();
        int arr[] = new int[size] ;
        System.out.print("\n--------------------------\nEnter Elements of array\n--------------------------\n " );
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("\n--------------------------\nEntered Elements of array\n--------------------------\n " );
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("\n" + i + " : " + arr[i]);
        }
        System.out.print("\nEnter Your Name : ");
        String s1 = input.nextLine();
        System.out.println("Hey! "+ s1);
    }
}
