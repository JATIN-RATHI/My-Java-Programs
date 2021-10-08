package net.codejava.sql;

import java.util.Scanner;

class NoMatchException extends Exception
{
    public String toString()
    {
        return "Exception thrown NoMatchException (num is 10) created by JATIN RATHI";
    }
}
public class Main {
    public static void main(String[] args) {
	// write your code here
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter any number : ");
            int num = input.nextInt();
            if(num == 10)
            {
                throw new NoMatchException();
            }
            System.out.println("Number Entered by user is not 10. Exception is not thrown.");
        }
        catch(NoMatchException e)
        { System.out.println(e);}
    }
}
