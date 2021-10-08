package com.company;
import java.util.*;
public class Main {
    static class Employee{
        Scanner input = new Scanner(System.in);
        private int salary, whr;
        Employee()
        {
            salary = 1;
            whr = 1;
        }
        public void getInfo()
        {
            System.out.print("Enter Salary of employee : ");
            salary = input.nextInt();
            System.out.print("Enter Working hours per day : ");
            whr = input.nextInt();
            if (salary < 500)
            {
                AddSal();
            }
            if (whr > 6)
            {
                AddWork();
            }
        }
        public void AddSal()
        {
            salary += 100;
        }
        public void AddWork()
        {
            salary += 50;
        }
        public void finalSalary()
        {
            System.out.println("The final salary of employe working "+ whr + "hr per day = "+ salary);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Employee me = new Employee();
        me.getInfo();
        me.finalSalary();
    }
}
