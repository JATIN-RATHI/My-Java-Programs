package net.codejava.sql;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer>  a = new ArrayList<>();
        for(int i = 5; i < 12; i ++)
        {
            a.add(i);
        }
        System.out.println(a);
        Spliterator<Integer> spltr = a.spliterator();
        while(spltr.tryAdvance((n) -> System.out.println(n)));      //output list

        spltr = a.spliterator();
        ArrayList<Integer>  b = new ArrayList<>();
        while(spltr.tryAdvance((n) -> b.add((int) Math.sqrt(n))));
        System.out.println(b);                                  //output square list

        spltr = b.spliterator();
        spltr.forEachRemaining((n)->System.out.println(n));  //output square
    }
}
