package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    int num1 = 0, num2 = 1, num3, range;
	    System.out.print("Enter range of fibbonacii : ");
        range = input.nextInt();
	    System.out.print(num1 + " " + num2 + " ");
	    for (int i = 2; i < range ; i++)
        {
          num3 = num1 + num2;
          System.out.print(num3 + " ");
          num1 = num2;
         num2 = num3;
        }
    }
}
