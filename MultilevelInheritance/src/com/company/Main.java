package com.company;
import java.util.Scanner;

class GrandClass
{
    int Maths;
    int English;
    int Computer;
    GrandClass()  //use constructor instead
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Marks of following Subjects");
        System.out.print("Maths : ");
        Maths = input.nextInt();
        System.out.print("English : ");
        English = input.nextInt();
        System.out.print("Computer : ");
        Computer = input.nextInt();
    }
}
class FatherClass extends GrandClass
{
    int total;
    int TotalObtained()
    {
        total = Maths+English+Computer;
        System.out.println("Total Marks Got in Maths, English, Computer = " + total);
        return total;
    }
}
class SonClass extends FatherClass
{
    void PercentageObtained()
    {
        int t = TotalObtained();
        int percentage = (t*100)/300;
        System.out.println("Percentage  : " + percentage + " %");                   //(total/3)
    }
}
public class Main {

    public static void main(String[] args)
    {
        SonClass me = new SonClass();
        me.PercentageObtained();
    }
}
