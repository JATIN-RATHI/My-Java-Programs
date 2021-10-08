package com.company;
class myClass
{
    int a;
    int b;
    static int count;
    myClass()     //default constructor
    {
        a = 1;
        b = 1;
        count+=1;  //incrementing by 1 whn no arg object is declared
    }
    myClass(int x)  //1-arg constructor
    {
        a = x;     //by user
        b = 1;     //default value
        count+=1;  //incrementing by 1 whn 1 arg object is declared
    }
    myClass(int x, int y)   //two args constructor
    {
        a = x;
        b = y;
        count+=1;  //incrementing by 1 whn 2 arg object is declared
    }
    void printValue()
    {
        System.out.println("Number of Objects = " + count);
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
