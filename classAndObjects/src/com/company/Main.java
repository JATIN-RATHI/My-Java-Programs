package com.company;

public class Main {
    static class Student
    {
        int id;
        String name;
        int rollno;
        String dept;
        Student(int a, String b, int c)
        {
           id = a;
           name = b;
           rollno = c;
           dept = "IT";  //default
        }
        void Display()
        {
            System.out.println("ID : " + id + "\nName : " + name + "\nRoll No. : " + rollno + "\nDept : " + dept);
        }
    }
    public static void main(String[] args) {
	// write your code here
        Student me = new Student(1, "Jatin", 6);
        me.Display();

    }
}
