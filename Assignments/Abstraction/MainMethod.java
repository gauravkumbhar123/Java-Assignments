package com.technoelevate.javabasics.Abstraction;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactoryClass class1=new FactoryClass();
		System.out.println("select the browser from the give option");
		System.out.println("1.chrome");
		System.out.println("2.safari");
		System.out.println("3.mozilla");
		System.out.println("4.opera");
		System.out.println("please enter your selection/choice");
		int ch=sc.nextInt();
		Browser browser =null;
		switch (ch) {
		case 1:class1.getBrowser("chrome").start();
		break;
		case 2:class1.getBrowser("safari").start();
		break;
		case 3:class1.getBrowser("mozilla").start();
		break;
		case 4:class1.getBrowser("opera").start();
		}

	}

}
