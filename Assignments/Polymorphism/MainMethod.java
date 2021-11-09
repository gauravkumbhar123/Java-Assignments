package com.technoelevate.javabasics.Polymorphism;

public class MainMethod {

	public static void main(String[] args) {
		PolymorphismParent pl = new PolymorphismParent();
		pl.display();
		PolymorphismChild p2 = new PolymorphismChild();
		p2.display();
	}
}
