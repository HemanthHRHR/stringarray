package com.te.java8;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

public class Demo {

	int id;
	String name;
	double cost;

	public Demo(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}


	public static void main(String[] args) {
		        ArrayList<Demo> list = new ArrayList<Demo>();
                      list.add(new Demo(1, "hemanth", 343.35));
                      list.add(new Demo(2, "suraya", 43.36));
                      list.add(new Demo(3, "Hemantis", 56.6));
                      Stream<Demo> totalcost=list.stream().filter(a->a.cost>30.0);
                      
                      
                      list.forEach(a->System.out.println(a));
 	}

}
