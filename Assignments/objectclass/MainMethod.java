package com.technoelevate.javabasics.objectclass;

public class MainMethod {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung", 68000.45, 12);
		Mobile mobile2 = new Mobile("Apple", 124000.98, 3);
		System.out.println(mobile);
		System.out.println(mobile2);
		System.out.println(mobile.hashCode());// unique address given
		System.out.println(mobile2.hashCode());// unique address given
		System.out.println(mobile.equals(mobile2));
	}

}
