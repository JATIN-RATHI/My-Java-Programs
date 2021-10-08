package com.company;

public class Main {
static class Objects
{
    int value;
    Objects(int value){
        this.value = value;
    }
    void check(Objects Obj2, Objects Obj3)
    {
        if((this.value > Obj2.value) && (this.value > Obj3.value))
        {
            System.out.println("Object  1 is greater than Object 2 and Object 3");
        }
        else if (Obj2.value > Obj3.value)
        {
            System.out.println("Object  2 is greater than Object 1 and Object 3");
        }
        else
        {
            System.out.println("Object  3 is greater than Object 1 and Object 2");
        }
    }
}
    public static void main(String[] args) {
	// write your code here
        Objects obj1 = new Objects(15);
        Objects obj2 = new Objects(18);
        Objects obj3 = new Objects(16);
        obj1.check(obj2,obj3);
    }
}
