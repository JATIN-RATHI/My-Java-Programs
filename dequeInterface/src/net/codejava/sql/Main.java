package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Deque - ArrayDeque");
        Deque<Integer> q = new ArrayDeque<>();
        q.add(32);
        q.add(74);
        q.add(21);
        q.add(15);
        q.add(28);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek()); //first element in Deque
        System.out.println(q.poll());  //remove the element and print
        System.out.println(q);
        System.out.println(q.element()); //first element in Deque

        System.out.println("\n\nDeque - LinkedList");
        Deque<Integer> lq = new LinkedList<>();
        lq.add(34);
        lq.add(65);
        lq.add(23);
        lq.add(7);
        System.out.println(lq);
        lq.remove();
        System.out.println(lq);
        System.out.println(lq.peek());
        System.out.println(lq.size());

        System.out.println("\n\nDeque - Priority Deque doesnt implement here");
    }
}
