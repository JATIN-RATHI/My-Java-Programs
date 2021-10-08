package com.company;
import java.util.*;
interface i1{
    void add();
    void subtract();
}
interface i2{
    void multiply();
    void divide();
}
class calculator implements i1, i2
{
    int a;
    int b;
    calculator()
    {
        Scanner input = new Scanner(System.in);   //main
        System.out.println("Enter the value of a : ");
        a = input.nextInt();
        System.out.println("Enter the value of b : ");
        b = input.nextInt();
    }
    public void add()
    {
        System.out.println("Sum of a and b is " + (a+b));
    }
    public void subtract()
    {
        System.out.println("Difference of a and b is " + (a-b));
    }
    public void multiply()
    {
        System.out.println("Product of a and b is " + (a*b));
    }
    public void divide()
    {
        System.out.println("Division of a and b is " + (a/b));
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("i1 Interface reference\n-----------------------\n");
	    i1 a = new calculator();
	    a.add();
	    a.subtract();
	    ///////////////////
        System.out.println("i2 Interface reference\n-----------------------\n");
        i2 b = new calculator();
        b.multiply();
        b.divide();

        /////////////////
//        calculator a = new calculator();
//        a.add();
//        a.subtract();
//        a.multiply();
//        a.divide();
    }
}
