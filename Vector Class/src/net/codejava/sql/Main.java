package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<Integer> v = new Vector<>(3);
        System.out.println("Capacity of Vector initially : " + v.capacity());
        v.addElement(4);
        v.addElement(1);
        v.addElement(6);
        v.addElement(5);
        v.addElement(2);
        System.out.println(v);
        System.out.println("Capacity of Vector after adding 5 elements : "  + v.capacity());
        Collections.sort(v);
        System.out.println(v);
        System.out.println("Traversing using ENUMERATION      (Alternate : 1: Iterator, for each)\n");
        Enumeration<Integer> enm = v.elements();
        while(enm.hasMoreElements())
        {
            System.out.println(enm.nextElement());
        }
    }
}
