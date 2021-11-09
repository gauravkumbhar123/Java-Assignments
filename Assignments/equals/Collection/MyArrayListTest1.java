package com.technoelevate.javabasics.Collection;

import java.util.Iterator;
import java.util.Scanner;


public class MyArrayListTest1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int size1=sc.nextInt();
	MyArrayList1 arrayList=new MyArrayList1(size1);
	arrayList.addArrayElement(11);
	arrayList.addArrayElement(12);
	arrayList.addArrayElement(13);
	arrayList.addArrayElement(14);
	arrayList.addArrayElement(15);
	arrayList.addArrayElement(16);
	arrayList.addArrayElement(17);
	arrayList.addArrayElement(18);
	arrayList.addArrayElement(19);
	System.out.println(arrayList);
	System.out.println(arrayList.size());
	Iterator iterator=arrayList.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());

	}

}

}