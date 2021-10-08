package net.codejava.sql;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = input.nextLine();
        int ch;
        String str1;
        do {
            System.out.println("Menu\n------\n1: equals()\n2: trim()\n3: length()\n4: substring()\n5: compareTo()");
            System.out.print("Enter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1 -> {
                    System.out.print("Enter String 2 : ");
                    input.next();
                    str1 = input.nextLine();
                    System.out.println(str.equals(str1));
                }
                case 2 -> System.out.println("String : " + str.trim());
                case 3 -> System.out.println("Length of the String is : " + str.length());
                case 4 -> {
                    System.out.print("To get Substring \nEnter first index : ");
                    int i = input.nextInt();
                    System.out.print("Enter second index : ");
                    int j = input.nextInt();
                    System.out.println("Substring [" + i + "][" + j + "] = " + str.substring(i, j));
                }
                case 5 -> {
                    System.out.print("Enter any string : ");
                    input.next();
                    str1 = input.nextLine();
                    System.out.println("After Compare with previous String : " + str.compareTo(str1));
                    }
                default -> System.out.println("Invalid choice!");
                }
            System.out.print("\nWant to exit?(1,0): ");
            ch = input.nextInt();
            }while(ch != 1);
        }
    }
