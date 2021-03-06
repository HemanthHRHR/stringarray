package com.te.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllOperationsOfStreams {

	public static void main(String[] args) {
		List<Employe> list = Arrays.asList(new Employe(1, "hemanth", 34),new Employe(2, "Hemantis", 45));
         Employe emp = list.get(1);
         
         for (int i = 0; i < list.size(); i++) {
			if(emp.getAge()>list.get(i).getAge()) {
				emp=list.get(i);
			}
		}
         System.out.println(emp);
         System.out.println("========================================================");
         //maximum
         list.stream().max(Comparator.comparing(Employe::getAge)).ifPresent(System.out::print);
         System.out.println("========================================================");
         //minmam
         list.stream().min(Comparator.comparing(Employe::getAge)).ifPresent(System.out::print);
         System.out.println("=============================================================");
         //sorted
         List<Employe> collect = list.stream().sorted(Comparator.comparing(Employe::getAge)).collect(Collectors.toList());
         collect.forEach(System.out::print);
         
	}

}
