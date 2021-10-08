package com.company;
import java.util.Scanner;

class student{
    Scanner input = new Scanner(System.in);  //to input data from user
    String name;   //string  var
    int rollno;   //integer var
    student()       //default constructor
    {
        this.name = "NA";                   //this pointer is to point to the object whichever is instanced
        this.rollno = 00;
        System.out.println("Default Constructor invoked!");
    }
    student(String name)            //one arg constructor
    {
        this.name = name;
        this.rollno = 00;
        System.out.println("One-Arg Constructor Invoked!");
    }
    student(String name, int rollno)            //two-arg constructor
    {
        this.name = name;
        this.rollno = rollno;
        System.out.println("Two args constructor invoked!");
    }
    public void readData()              //method or function to read data from user
    {
        System.out.print("Enter Name : ");
        name = input.nextLine();
        System.out.print("Enter Roll no : ");
        rollno = input.nextInt();
    }
    public void displayData()           //method or function to display data entered by user
    {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollno);
    }
}
class place extends student   //Inheritance
{
    Scanner input = new Scanner(System.in);
    String location;
    place()
    {
        this.location = "NA";
    }
    place(String loc)
    {
        this.location = loc;
    }
    public void readData()          //method overriding
    {
        super.readData();           //super keyword to use base class method or var
        System.out.print("Enter the Place : ");
        location = input.nextLine();
    }
    public void displayData()           //method overriding
    {
        super.displayData();
        System.out.println("Place : " + location);
    }

}
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //base class object
        student s1 = new student();         //declaring object of student class
        s1.readData();                      //reading data
        System.out.println("Entered Data\n--------------");
        s1.displayData();                   //display data

        //derived class object
        place p1  = new place();            //declaring object of derived clas i.e place
        p1.readData();                      //reading data
        System.out.println("Entered Data\n--------------");
        p1.displayData();                   //display data
    }
}
