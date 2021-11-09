package com.technoelevate.javabasics.Collection;

import java.util.Iterator;

public abstract class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList arrayList=new MyArrayList(5);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(30);
		
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		 Iterator iterator = arrayList.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
			 
		 }
		
	}

}
