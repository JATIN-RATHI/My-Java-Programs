package com.company;

import java.util.*;
public class Main {
    static class swapping
    {
        int a, b;
        swapping(int a, int b)
        {
            this.a = a;
            this.b = b;//constructor default
        }
        void swapit(swapping obj2)    //function to swap , call by ref
        {
            int temp;
            temp = obj2.a;
            obj2.a = obj2.b;
            obj2.b = temp;
            System.out.println("Object 1 (a) = " + obj2.a);
            System.out.println("Object 1 (b) = " + obj2.b);
        }
        void swapit(int a, int b)
        {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

    }
    public static void main(String args[]) {
        swapping obj1 = new swapping(12, 20);
        obj1.swapit(obj1);
        //second function
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a =  input.nextInt();
        System.out.print("Enter the value of b : ");
        b =  input.nextInt();
        System.out.println("Value of a and b before swapping is " + a + " and " + b);
        swapping obj2 = new swapping(a, b);
        obj2.swapit(a, b);
        System.out.println("Value of a and b after swapping is " + a + " and " + b);
    }
}
