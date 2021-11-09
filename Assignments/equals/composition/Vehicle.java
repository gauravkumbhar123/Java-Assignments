package com.technoelevate.javabasics.composition;

public class Vehicle {
String name;
String color;
Engine engine;
Tyres tyres;
double price;
public Vehicle(String name, String color, Engine engine, Tyres tyres, double price) {
	super();
	this.name = name;
	this.color = color;
	this.engine = engine;
	this.tyres = tyres;
	this.price = price;
}
public void status() {
	System.out.println(this.name+" "+this.color+" "+this.engine+" "+this.tyres+" "+this.price);
	System.out.println("Vehicle is ready to go on roads");
}

}
