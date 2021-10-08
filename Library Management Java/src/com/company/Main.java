package com.company;

import java.util.Scanner;

//Make four methods
        //1.Issue Book
        //2.Add Book
        //3.Return Book
        //4.Show Books
//make an array of books to manipulate
//array of students i.e, objects
class VipLibrary   //Library class
{
    Scanner input = new Scanner(System.in);   //it is to make datatype for inputing value from user
    String name;
    String course;
    int rollNo;
    int total;
    String[] books;
    VipLibrary()
    {
        this.name = "NA";
        this.course = "NA";
        this.rollNo = 0;
        this.total = 0;
        this.books = new String [100];
    }
    public  void initBooks()
    {
        books[0] = "Mathematics";
        books[1] = "OOPS";
        books[2] = "Vb.net";
        books[3] = "Accounts";
        books[4] = "C";
        books[5] = "C++";
        books[6] = "Java";
        books[7] = "Data Structure";
    }
    public void readData()
    {
        System.out.print("\tName : ");
        name = input.nextLine();
        System.out.print("\tCourse : ");
        course = input.nextLine();
        System.out.print("\tRoll no : ");
        rollNo = input.nextInt();

    }
    public void showBooks()
    {
        int i = 0;
        System.out.println("\t---------------\n\tAvailable Books\n\t---------------");
        for (String book : books) {
            if (book == null){
                continue;
            }
            System.out.println("\t" +(i+1)+": " + book);
            i++;
        }
    }
    public void issueBook()
    {
        System.out.print("Enter Book Name from Available books : ");
        String askbook = input.nextLine();
        for(int i = 0; i < this.books.length; i++)
        {
            if(this.books[i].equals(askbook)) {
                System.out.println(askbook + " is issued to '" + this.name + "' of Course '" + this.course + "' roll no. " + this.rollNo);
                books[i] = null;
                return;
            }
        }
        System.out.println("Sorry! " + this.name + " , Book you entered is not available at this moment.");
    }
    public void returnBook()
    {
        System.out.print("Enter the Book name : ");
        String newbk = input.nextLine();
        this.books[total] = newbk;
        total++;
        System.out.println(newbk+ " has been added successfully!");
    }
    public void addBook()
    {
        returnBook();
    }
}
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);   //it is to make datatype for inputing value from user
        int choice;  //to take choice of the student in Library Menu
        int num;  //to take number of objects from user i.e, students
        System.out.print("Enter the number of Student who are visiting Library : ");
        num = input.nextInt();    //user input

        VipLibrary[] students = new VipLibrary[num];   //array of objects for multiple students to do transaction in library
        for (int i = 0; i < num ; i++)   //loop until all students do transaction in library once
        {
            students[i] = new VipLibrary();
            students[i].initBooks();
            System.out.println("\t\t---------\n\t\tStudent " + (i+1) +"\n\t\t---------" );
            students[i].readData();
            do {
                System.out.println("\nChoose 1 from the Menu\n\t1. Show Books\n\t2. Issue Book\n\t3. Return Book\n\t4. Add Book\n\t5.Exit");
                System.out.print("Your Choice : ");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> students[i].showBooks();
                    case 2 -> students[i].issueBook();
                    case 3 -> students[i].returnBook();
                    case 4 -> students[i].addBook();
                    case 5 -> System.out.println("Thankyou!" + students[i].name);
                    default -> System.out.println("Please choose from the Menu.");
                }
            } while (choice != 5);

        }

    }
}
