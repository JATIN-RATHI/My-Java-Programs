package com.company;
import java.util.*;
public class Main {
    public static class Accounts {
        Scanner input = new Scanner(System.in);
        String name;
        int ac_no;
        String ac_name;
        int balance;
        Accounts()
        {
            ac_no = 1;
            name = "NA";
            ac_name = "Saving";
            balance = 1000;
        }
        public void getInfo()
        {
            System.out.print("Enter account number : ");
            ac_no = input.nextInt();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Name of Account Holder : ");
            name = input.nextLine();
            System.out.print("Enter Account Name(Saving/Current) : ");
            ac_name = input.nextLine();
            System.out.print("Enter Balance in Your account : ");
            balance = input.nextInt();
        }
        public void withdrawal()
        {
            System.out.print("Enter Amount to withdraw : ");
            int wAmt = input.nextInt();
            balance-=wAmt;
        }
        public void deposit()
        {
            System.out.print("Enter Amount to deposit : ");
            int dAmt = input.nextInt();
            balance += dAmt;
        }
        public void display()
        {
            System.out.println("Account No. : " + ac_no + "\nName of Account Holder : " + name + "\nAccount Type : " + ac_name + "\nBalance : " + balance);
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Accounts holder1 = new Accounts();
        holder1.getInfo();   //to take ac holder info
        System.out.println("Choose any 1 from the below Menu\n1 : Withdraw\n2 : Deposit");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                holder1.withdrawal();
                holder1.display();
            }
            case 2 -> {
                holder1.deposit();
                holder1.display();
            }
            default -> System.out.println("Wrong Input!");
        }

    }
}
