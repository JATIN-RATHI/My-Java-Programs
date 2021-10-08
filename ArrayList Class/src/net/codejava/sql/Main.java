package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 5; i ++)
        {
            a.add(i);
        }
        System.out.println(a);
        ArrayList<String>  s = new ArrayList<>();
        s.add("j");
        s.add("a");
        s.add("t");
        s.add("i");
        s.add("n");
        System.out.println(s);
        s.add(0, "p");
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
        System.out.println("\nArrayList to Array");
        Integer []arr = new Integer[a.size()];
        arr = a.toArray(arr);
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
