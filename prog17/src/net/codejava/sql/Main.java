package net.codejava.sql;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        try
        {
            int result = num1 / num2;
            System.out.println("Division of " + num1 + " and " + num2 +" is " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attempted to divide a number by zero -> " + e);
        }
        finally
        {
            int sum = num1 + num2;
            if(sum % 2 == 0)
            {
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum + " which is Even Number");
            }
            else
            {
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum + " which is Odd Number");
            }
        }
    }
}
