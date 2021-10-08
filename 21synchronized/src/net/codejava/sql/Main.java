package net.codejava.sql;
class buying implements Runnable
{
    int item_val = 1;
    synchronized public void run()
    {
        System.out.println("Items Available : " + item_val);
        if(item_val != 0) {
            System.out.println("Order Placed successfully");
            try {
                Thread.sleep(1000);
                item_val = 0;
            } catch (InterruptedException e) {
            }
        }
        else {
                System.out.println("Sorry, Out of Stock");
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        buying b1 = new buying();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        t1.start();
        t2.start();
    }
}
