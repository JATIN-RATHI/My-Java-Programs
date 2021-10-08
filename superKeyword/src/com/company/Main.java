package com.company;
class parent
{
    int rollNo;
    String name;
    parent(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }
    void Display()
    {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
    }
}

class child extends parent
{
    int batch;
    child(int rollNo, String name, int batch)
    {
        super(rollNo, name);
        this.batch = batch;

    }
    void Display()    //overridding
    {
       super.Display();   //
       System.out.println("Batch : " + batch );
    }

}
public class Main {

    public static void main(String[] args) {
        child one = new child(6, "Jatin Rathi", 2019);
        one.Display();
    }
}
