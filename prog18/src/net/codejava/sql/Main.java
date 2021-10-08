package net.codejava.sql;

import java.util.Scanner;

class NoMatchException extends Exception{
    public String toString(){
        return ("Invalid Entry");
    }
}

public class Main {
    public static void check(int n) throws NoMatchException{
        if(n == 10)
        {
            throw new NoMatchException();
        }
        System.out.println(n );
    }
    public static void main(String[] args){
	// write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        try{
            check(num);
        }catch (NoMatchException e){
            System.out.println(e);
        }
    }
}
