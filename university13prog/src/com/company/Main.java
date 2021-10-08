package com.company;

import java.util.Scanner;

class Student
{
    Scanner input = new Scanner(System.in);
    int id;
    String Name;
    Student()
    {
        System.out.print("Enter Student's ID : ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student's Name : ");
        Name = input.nextLine();
    }
    void Display()
    {
        System.out.println("ID : " + id);
        System.out.println("Name : " + Name);
    }
}
class Exam extends Student
{
    Scanner input = new Scanner(System.in);
    int[] marks = new int[5];
    int total_marks;
    Exam()
    {
        System.out.println("\nEnter Marks\n-------------\n");
        for(int i = 0; i < marks.length; i++)
        {
            System.out.print( (i+1) + " : ");
            marks[i] = input.nextInt();
            total_marks += marks[i];
        }
    }
}
interface Sports
{
    int grace_marks = 10;
}
class Results extends Exam implements Sports
{
    @Override
    public void Display() {
        super.Display();
        System.out.println("Sports Grace Marks : " + grace_marks);
        System.out.println("Total marks in all subjects " + total_marks);
        System.out.println("Total marks in all subjects including grace marks in sports : " + (total_marks + grace_marks));
    }
}
public class Main {
    public static void main(String[] args) {
        Results mine = new Results();
        System.out.println("\n--------------------\n");
        mine.Display();
        System.out.println("\n--------------------\n");
    }
}
