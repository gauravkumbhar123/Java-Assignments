package com.technoelevate.javabasics.composition;

public class MainMethod {
public static void main(String[] args) {
	Engine engine=new Engine("S4","30-11-1991",1234,"Diesel");
	Tyres tyres=new Tyres("MRF","Tubleless",14.6f,130000.89);
	Vehicle vehicle=new Vehicle("Audi", "white", engine,tyres, 400000);
	vehicle.status();
} 
}