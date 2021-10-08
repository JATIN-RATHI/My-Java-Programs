package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
