package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("QUEUE - ArrayDeque");
        Queue<Integer> q = new ArrayDeque<>();
        q.add(32);
        q.add(74);
        q.add(21);
        q.add(15);
        q.add(28);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek()); //first element in queue
        System.out.println(q.poll());  //remove the element and print
        System.out.println(q);
        System.out.println(q.element()); //first element in queue

        System.out.println("\n\nQUEUE - LinkedList");
        Queue<Integer> lq = new LinkedList<>();
        lq.add(34);
        lq.add(65);
        lq.add(23);
        lq.add(7);
        System.out.println(lq);
        lq.remove();
        System.out.println(lq);
        System.out.println(lq.peek());
        System.out.println(lq.size());

        System.out.println("\n\nQUEUE - Priority Queue");
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < 5; i++)
        {
            pq.add(i);
        }
        System.out.println(pq);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println("\nQUEUE - PriorityBlockingQueue");
    }
}
