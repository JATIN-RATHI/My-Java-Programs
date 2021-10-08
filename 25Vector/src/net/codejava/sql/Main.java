package net.codejava.sql;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the Vector : ");
        int n = input.nextInt();
        Vector <Integer> v = new Vector<>(n);
        System.out.println("Enter elements of Vector");
        for(int i = 0; i < n; i ++)
        {
            int num = input.nextInt();
            v.add(num);
        }
        int ch;
        System.out.println("Vector : " + v);
        do {
            System.out.println("Enter you choice \n1: Add Element\n2: Remove Element\n3: Show Element at position\n4: Size of Vector ");
            System.out.print("Enter your choice : ");
            ch = input.nextInt();
            int ele;
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter the element to add : ");
                    ele = input.nextInt();
                    v.add(ele);
                    System.out.println("Vector Updated : " + v);
                }
                case 2 -> {
                    System.out.print("Enter the element index to remove : ");
                    ele = input.nextInt();
                    v.remove(ele);
                    System.out.println("Vector Updated : " + v);
                }
                case 3 -> {
                    System.out.print("Enter the index number of element to display : ");
                    ele = input.nextInt();
                    System.out.println(v.elementAt(ele));
                }
                case 4 -> System.out.println("Size of the Vector is : " + v.size());
                default -> System.out.println("Wrong Choice!");
            }
            System.out.print("Want to exit?(1,0)");
            ch = input.nextInt();
        }while(ch != 1);
    }
}
