package com.company;
class myClass
{
    int a;
    int b;
    void swapItVal()
    {
        a = a-b;
        b = a+b;
        a = b-a;
    }
    void swapItRef(myClass one)
    {
        one.a = one.a-one.b;
        one.b = one.a+one.b;
        one.a = one.b-one.a;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------\nCall By Value\n---------------");
        myClass one = new myClass();
        one.a = 85;
        one.b = 96;
        System.out.println("Before Swapping \na = "+ one.a + "\nb = " + one.b);
        one.swapItVal();
        System.out.println("After Swapping\na = " + one.a + "\nb = " + one.b);
        System.out.println("---------------\nCall By Reference\n---------------");
        myClass two = new myClass();
        two.a = 85;
        two.b = 96;
        System.out.println("Before Swapping \na = "+ two.a + "\nb = " + two.b);
        two.swapItRef(two);
        System.out.println("After Swapping\na = " + two.a + "\nb = " + two.b);
    }
}
