package com.company;
import java.util.*;
class vehicle
{
    int wheels;
    String type;
    int seater;
    void GetData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of wheels : ");
        wheels = input.nextInt();
        input.nextLine();
        System.out.print("Enter the type(Automatic/Manual) : ");
        type = input.nextLine();
        System.out.print("Enter the seating capacity : ");
        seater = input.nextInt();
        input.nextLine();
    }
    void PrintData()    //method overloading with no args
    {
        System.out.println("No. of wheels : " + wheels);
        System.out.println("Type(Automatic/Manual) : " + type);
        System.out.println("Seating capacity : " + seater);
    }
}

class car extends vehicle
{
    String company;
    String color;
    void GetData()  //method overriding
    {
        super.GetData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Company Name : ");
        company = input.nextLine();
        System.out.print("Enter the color : ");
        color = input.nextLine();
    }
    void PrintData()   //method overriding
    {
        super.PrintData();
        System.out.println("Company Name : " + company);
        System.out.println("Color : " + color);
    }
}

public class Main {

    public static void main(String[] args)
    {
        ////////////////// Runtime polymorphism/////////////////
        car c1 = new car();
        System.out.println("--------------------------");
        c1.GetData();     //will call its own method
        System.out.println("--------------------------");
        c1.PrintData();    //will call its own method
    }
}

