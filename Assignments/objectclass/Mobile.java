package com.technoelevate.javabasics.objectclass;

public class Mobile {
	String name;
	double price;
    int ram;
	public Mobile(String name, double price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public boolean equals(Object obj) {
		Mobile mobile =(Mobile)obj;
		return (this.name).equals(mobile.name);
	}
	
	}
	
    
