package com.technoelevate.javabasics;

public class MultipleInheritanceGrandChild extends MultipleInheritanceChild {
 public void DemoC() {
	 System.out.println("Demo3() is a method of MultipleInheritanceGrandChild class");
 }
	public static void main(String[] args) {
		MultipleInheritanceChild b=new MultipleInheritanceChild();
		b.DemoA();
		b.DemoB();
		b.DemoA();
	}
}
