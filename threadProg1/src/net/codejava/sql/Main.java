package net.codejava.sql;
class A extends Thread
{
    public void run()
    {
        for(int i = 1; i < 6; i++)
        {
            System.out.println("A : " + i);
        }
        System.out.println("A thread exited!");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j = 6; j < 11; j++)
        {
            System.out.println("B: " + j);
        }
        System.out.println("B thread exited!");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k = 11; k < 16; k++)
        {
            System.out.println("C : " + k);
        }
        System.out.println("C thread exited!");
    }
}
public class Main {
    public static void main(String[] args) {
	// write your code here
        A thread1 = new A();
        B thread2 = new B();
        C thread3 = new C();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
