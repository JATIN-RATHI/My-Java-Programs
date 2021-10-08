package net.codejava.sql;

import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Set<Integer> s = new HashSet<>();   //we can change the class of set like treeset, hashset,LInked hash set
        s.add(13);
        s.add(7);
        s.add(-4);
        s.add(9);
        s.add(1);
        System.out.println(s);
        Iterator <Integer> itr = s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("\n\n");
        SortedSet<String> ss = new TreeSet<>();  //only Treeset class implemented
        ss.add("Hii");
        ss.add("What");
        ss.add("Okey");
        ss.add("yes");
        ss.add("Always");
        System.out.println("SortedSet : " + ss);

    }
}
