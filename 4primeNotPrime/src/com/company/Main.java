package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// WAP to obtain a number by a user & check if it’s prime or not.
        System.out.println("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for(int i = 2; i * i <= num; i++)
        {
            if(num%i==0)
                count++;
        }
        if(count == 0)
        {
            System.out.println("Number is Prime! ");
        }
        else
        {
            System.out.println("Number is Not Prime! ");
        }
    }
}
