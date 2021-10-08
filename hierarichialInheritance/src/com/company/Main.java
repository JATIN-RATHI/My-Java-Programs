package com.company;
import java.util.*;


class Member
{
    String Name;
    int Age;
    int PhoneNo;
    String Address;
    int Salary;
    Member()  //default constructor
    {
        this.Name = "NA";
        this.Address = "NA";
    }
    public void MemberGetData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        Name = input.nextLine();
        System.out.print("Enter Age : ");
        Age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Phone Number : ");
        PhoneNo = input.nextInt();
        input.nextLine();
        System.out.print("Enter Address : ");
        Address = input.nextLine();
        System.out.print("Enter Salary : ");
        Salary = input.nextInt();
    }
    public void MemberPrintData()
    {
        System.out.println("Name : " + Name);
        System.out.println("Phone No : " + PhoneNo);
        System.out.println("Age : " + Age);
        System.out.println("Address : " + Address);
    }
    public void printSalary()
    {
        System.out.println("Salary of the Member is  "+Salary);
    }
}

class Employee extends Member {
    String spcl;

    Employee() {this.spcl = "NA"; }  //Default constructor

    public void EmpGetData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Specialization : ");
        spcl = input.nextLine();
    }
    public void EmpPrintData()
    {
        System.out.println("Specialization : " + spcl);
    }
}

class Manager extends Member
{
    String Dept;
    Manager()
    {this.Dept = "NA";}  //DEFAULT CONSTRUCTOR
    public void ManagerGetData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Department : ");
        Dept = input.nextLine();
    }
    public void ManagerPrintData()
    {
        System.out.println("Department : " + Dept);
    }
}
class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter Details of Employeee\n------------------\n");
        Employee emp1 = new Employee();
        emp1.MemberGetData();   //for using base class method
        emp1.EmpGetData();
        System.out.println("\nDetails of Employeee\n------------------\n");
        emp1.MemberPrintData();
        emp1.EmpPrintData();
        System.out.println("\n\n");
        /////////////////////////////
        System.out.println("\nEnter Details of Manager\n------------------\n");
        Manager mgr1 = new Manager();
        mgr1.MemberGetData();       //for using base class method
        mgr1.ManagerGetData();
        System.out.println("\nDetails of Employeee\n------------------\n");
        mgr1.MemberPrintData();     //for using base class method
        mgr1.ManagerPrintData();
    }
}


