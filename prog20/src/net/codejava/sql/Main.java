package net.codejava.sql;
class Even extends Thread{
    public void run()
    {
        for(int i = 0 ; i < 100; i += 2)
        {
            System.out.println("EVEN : " + i);
        }
    }
}

class odd extends Thread{
    public void run()
    {
        for(int i = 1 ; i < 100; i += 2)
        {
            System.out.println("ODD : " + i);
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Even t1 = new Even();
        t1.start();
        odd t2 = new odd();
        t2.start();
    }
}
