package net.codejava.sql;
class table4 implements Runnable {
    public void run()
    {
        for(int i = 1; i <=10; i ++)
        {
            System.out.println("Table 4: "+4 * i);
        }
        System.out.println("Table of 4 exited");
    }
}
class table11 implements Runnable {
    public void run()
    {
        for(int i = 1; i <= 10; i ++)
        {
            System.out.println("Table 11: "+11 * i);
        }
        System.out.println("Table of 11 exited");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        table4 four = new table4();
        table11 eleven = new table11();

        Thread t1 = new Thread(four);
        Thread t2 = new Thread(eleven);

        t1.start();
        t2.start();
    }
}
