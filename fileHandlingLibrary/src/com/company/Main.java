package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/*canRead()	Boolean	Tests whether the file is readable or not
        canWrite()	Boolean	Tests whether the file is writable or not
        createNewFile()	Boolean	Creates an empty file
        delete()	Boolean	Deletes a file
        exists()	Boolean	Tests whether the file exists
        getName()	String	Returns the name of the file
        getAbsolutePath()	String	Returns the absolute pathname of the file
        length()	Long	Returns the size of the file in bytes
        list()	String[]	Returns an array of the files in the directory
        mkdir()	Boolean	Creates a directory*/

public class Main {
    static void displayBook()
    {
        int i = 1;
        try {
            File myObj = new File("filehandling.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(i + ": "+data);
                i+=1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static void issueBook()
    {
        int isbook;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Book from the following");
        displayBook();
        System.out.print("Enter your choice : ");
        isbook = input.nextInt();
        System.out.println(isbook + " no. book of list is successfully issued!");
    }
    static void returnBook()
    {
        int isbook;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Book from the following to return ");
        displayBook();
        System.out.print("Enter your choice : ");
        isbook = input.nextInt();
        System.out.println(isbook + " no. book of list is successfully returned!");
    }
    static void addBook()
    {
        Scanner input = new Scanner(System.in);
        String addit;
        try {
            FileWriter myWriter = new FileWriter("filehandling.txt", true);
            System.out.print("Enter the Name of the Book : ");
            addit = input.nextLine();
            myWriter.write("\n"+addit);
            myWriter.close();
            System.out.println("Book is added successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------VIPS LIBRARY------");
            System.out.println("1.Display Books\n2.Issue Books\n3.Return Book\n4.Add Book");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> displayBook();
                case 2 -> issueBook();
                case 3 -> returnBook();
                case 4 -> addBook();
                default -> System.out.println("Invalid Input! Please choose from the Menu.");
            }
            System.out.println("Thankyou for visiting VIPS LIBRARY.\n Visit Again!\n");
        }while(true);
    }
}
