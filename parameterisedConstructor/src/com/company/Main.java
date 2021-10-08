package com.company;
class myClass
{
    int a;
    int b;
    myClass()     //default constructor
    {
        a = 1;
        b = 1;
        System.out.println("Default/no-arg constructor invoked!");
    }
    myClass(int x)  //1-arg constructor
    {
        a = x;     //by user
        b = 1;     //default value
        System.out.println("1-Arg constructor invoked!");
    }
    myClass(int x, int y)   //two args constructor
    {
        a = x;
        b = y;
        System.out.println("2-Arg constructor invoked!");
    }
    void printValue()
    {
        System.out.println("a = "+ a + "\nb = " + b);
    }
}

public class Main {

    public static void main(String[] args) {
	// Constructor Overloading
        myClass one = new myClass();   //call default constructor
        one.printValue();
        myClass two = new myClass(50);   //call 1-arg constructor
        two.printValue();
        myClass three = new myClass(89, 95);   //call 2-arg constructor
        three.printValue();
    }
}
