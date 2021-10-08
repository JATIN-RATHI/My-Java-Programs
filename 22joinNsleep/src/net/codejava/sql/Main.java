package net.codejava.sql;
class myclass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {     }
        }
    }
}
public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        myclass t1  = new myclass();
        myclass t2 = new myclass();
        myclass t3 = new myclass();
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
