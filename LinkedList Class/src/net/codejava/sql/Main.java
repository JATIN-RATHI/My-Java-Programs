package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> l = new LinkedList<>();
        for(int i = 2; i < 7; i ++)
        {
            l.add(i);
        }
        System.out.println(l);
        l.remove(2);
        System.out.println(l);

    }
}
