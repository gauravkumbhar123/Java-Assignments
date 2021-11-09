package com.technoelevate.javabasics;

public class InterfaceParentChildGrandChildMain {
	public static void main(String[] args) {
		ImplementationClass implementationClass = new ImplementationClass();
		implementationClass.parentMethod();
		implementationClass.childMethod();
		implementationClass.grandChildMethod();
		implementationClass.abstractMethod();
		System.out.println(InterfaceParent.i);
		System.out.println(InterfaceChild.num);
		System.out.println(InterfaceGrandChild.f);
		System.out.println(InterfaceGrandChild.i);
		System.out.println(InterfaceGrandChild.num);
	}
}

