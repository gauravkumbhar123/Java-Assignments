package com.technoelevate.javabasics;

public class FinalKeyword {
int speedlimit=90;//final variable 
		 void run(){  
		  speedlimit=400;  
		 }  
		 public static void main(String args[]){  
		 FinalKeyword obj=new  FinalKeyword();  
		 obj.run();  
		 }  
}
