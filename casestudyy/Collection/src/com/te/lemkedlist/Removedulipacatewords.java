package com.te.lemkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Removedulipacatewords {
//	public static void main(String args[]) {
//		String s ="hemanth is dancer dancer is hemanth He-Mantis";
//		String[] split = s.split(" ");
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for (String s1 : split) {
//			if(map.containsKey(s1)) {
//				map.put(s1, map.get(s1)+1);
//			}else {
//				map.put(s1, 1);
//			}
//		}
//		Set<String> set = map.keySet();
//		for (String string : set) {
//			System.out.println(string);
//             System.out.println(map.get(string));			
//		}
//		
//	}
	
	public static void main(String... args) {
        String[] wordArray = {"House", "House", "House", "Dog", "Dog", "Dog", "Dog"};
         Map<String, Long> map = Arrays.stream(wordArray).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
        
        
    }
}

	
