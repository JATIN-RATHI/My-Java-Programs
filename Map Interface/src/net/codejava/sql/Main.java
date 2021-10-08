package net.codejava.sql;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer, String> mp = new HashMap<>();      //classes - abstractmap, enummap, hashmap, treemap, weakhashmap, linkedhahmap, identtyhashmap
        mp.put(1,"Google");
        mp.put(5,"Microsoft");
        mp.put(3,"Goldman Sachs");
        mp.put(4,"Intel");
        mp.put(2,"Amazon");
        System.out.println(mp);                 //sorted keys
        System.out.println(mp.get(3));  //get value of key entered
        mp.putIfAbsent(0,"Uber");       //if key doesnt match - adds
        System.out.println(mp);
        mp.replace(0,"Apple");       //replace
        System.out.println(mp);
        mp.remove(4);       //remove
        System.out.println(mp + "      'size'   =   " + mp.size());
         //getkey(), getvalue(),putall()
        Map<Integer, String> map = new HashMap<>();
        map.put(7, "Uber");
        map.put(8, "IBM");
        map.putAll(mp);             //it will add mp's elements in map
        System.out.println(map);
    }
}
