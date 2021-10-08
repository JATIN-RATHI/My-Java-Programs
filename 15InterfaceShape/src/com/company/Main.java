package com.company;
import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}
class circle implements Shape
{
    int radius;
    circle()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        radius = input.nextInt();
    }
    @Override
    public void area()
    {
        System.out.println("Radius = " + radius + "\nArea = " + (3.14*radius*radius));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter = " + (2*3.14*radius));
    }
}
class rectangle implements Shape
{
    int length;
    int breadth;
    rectangle()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle : ");
        length = input.nextInt();
        System.out.println("Enter Breadth of Rectangle : ");
        breadth = input.nextInt();
    }
    @Override
    public void area()
    {
        System.out.println("Length = " + length +"\nBreadth = " + breadth + "\nArea = " + (length*breadth));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter = " + (2 * (length+breadth)));
    }
}
class square implements Shape
{
    int side;
    square()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        side = input.nextInt();
    }
    @Override
    public void area()
    {
        System.out.println("Side = " + side + "\nArea = " + (side*side));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter = " + (4*side));
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("-------Circle---------");
        circle a = new circle();
        a.area();
        a.perimeter();
        System.out.println("-------Rectangle---------");
        rectangle b = new rectangle();
        b.area();
        b.perimeter();
        System.out.println("-------Square---------");
        square c = new square();
        c.area();
        c.perimeter();
    }
}
