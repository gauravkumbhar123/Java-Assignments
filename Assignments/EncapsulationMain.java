package com.technoelevate.javabasics;

public class EncapsulationMain {

		public static void main(String[] args) {
			EncapsulationDemo demo = new EncapsulationDemo();
			demo.setName("Gourav");
			demo.setAge(22);
			demo.setPlace("Pune");
			System.out.println(demo.getName());
			System.out.println(demo.getAge());
			System.out.println(demo.getPlace());
		}

	}