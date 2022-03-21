package com.te.java8;
import java.util.*;  

public class Product {
	
	    int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	 
	 
	    public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        // count number of products based on the filter  
	        long count = productsList.stream()  
	                    .filter(product->product.price<30000)  
	                    .count();  
	        System.out.println(count);  
	    }  
}
