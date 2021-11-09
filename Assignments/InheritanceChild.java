package com.technoelevate.javabasics;

public class InheritanceChild extends InheritanceParent {
public  void demo2() {
System.out.println("Demo2() method of class Inheritance child");
}
	public static void main(String[] args) {
	InheritanceChild a=new InheritanceChild() ;
	a.demo1();
	a.demo2();

	}

}
