package com.technoelevate.javabasics.equals;

public class DiffBetweenEquals {

	public static void main(String[] args) {
		 String s1 = "Hi";
	        String s2 = "HELLO";
	        String s3 =  new String("Ho are you");
	        System.out.println(s1 == s2); 
	        System.out.println(s1 == s3); 
	        System.out.println(s1.equals(s2)); 
	        System.out.println(s1.equals(s3));

	}

}
