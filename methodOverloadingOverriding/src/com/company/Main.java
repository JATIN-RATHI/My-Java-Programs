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
    void PrintData(int a)  //method overloading with one arg integer type
    {
        System.out.println("No. of wheels : " + a);
    }
    void PrintData(String s)    ////method overloading with one arg with String type
    {
        System.out.println("Type(Automatic/Manual) : " + s);
    }
    void PrintData(int a, String s)    //method overloading with two args with int, string type
    {
        System.out.println("No. of wheels : " + a);
        System.out.println("Type(Automatic/Manual) : " + s);
    }
    void PrintData(int a, String s, int b)      //method overloading with three args int, string,int type
    {
        System.out.println("No. of wheels : " + a);
        System.out.println("Type(Automatic/Manual) : " + s);
        System.out.println("Seating capacity : " + b);
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Company Name : ");
        company = input.nextLine();
        System.out.print("Enter the color : ");
        color = input.nextLine();
    }
    void PrintData()   //method overriding
    {
        System.out.println("Company Name : " + company);
        System.out.println("Color : " + color);
    }
}

public class Main {

    public static void main(String[] args)
    {
        vehicle v1 = new vehicle();
        v1.GetData();
        System.out.println("--------------------------");
        v1.PrintData();
        System.out.println("--------------------------");
        v1.PrintData(4);
        System.out.println("--------------------------");
        v1.PrintData("Semi-Automatic");
        System.out.println("--------------------------");
        v1.PrintData(4, "Manual");
        System.out.println("--------------------------");
        v1.PrintData(4, "Automatic" , 7);

        //////////////////

        car c1 = new car();
        System.out.println("--------------------------");
        c1.GetData();     //will call its own method
        System.out.println("--------------------------");
        c1.PrintData();    //will call its own method
    }
}
