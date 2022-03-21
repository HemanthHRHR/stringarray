package com.te.treelist;
import java.util.*;

public class TreeSe {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(24);  
        set.add(66);  
        set.add(12);  
        set.add(15);  
        System.out.println("Highest Value: "+set.pollFirst());  
        System.out.println("Lowest Value: "+set.pollLast());  
        System.out.println("reverse order: "+set.descendingSet());
}  
}  
	
