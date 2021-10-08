package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(8);
        a.add(0);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(7);
        Collections.sort(a);
//        System.out.println(a);
//        ListIterator<Integer> itr = a.listIterator();   //to iterate list
//        while(itr.hasNext())
//        {
//            System.out.println("Index(" + itr.nextIndex() + ") = " + itr.next());
//        }
        for(int i = 0; i < a.size(); i++)
        {
            System.out.println(i + "  =  " + a.get(i));
        }

        a.set(3, 4);
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        if(a.contains(3))
        {
            System.out.println("List does contain : 3");
        }
        Collections.replaceAll(a, 1, 4);
        System.out.println(a);
        List<Integer> b = a.subList(0,3);
        System.out.println("A : " + a + "\nB : " + b);
        System.out.println(a.getClass() + " : " +  a);

    }

}
