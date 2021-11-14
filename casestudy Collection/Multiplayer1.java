package com.technoelevate.casestudy.multiplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayer1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1.Tum se hi");
		list.add("2.Love Nwantiti");
		list.add("3.My Hearts a Stereo");
		list.add("4.Arcade");
		list.add("5.Ek din Aap");
		list.add("6.Believer");
		list.add("7.Maskara");
		System.out.println("1.Play a Song \n2.Search a Song \n3.Operate on Multiplayer");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice");
		int option=sc.nextInt();
		switch(option) {
		case 1:{

			ArrayList<String> optionList= new ArrayList<String>();
			optionList.add("1.Play all songs");
			optionList.add("2. Play Random Song");
			optionList.add("3.Play a particular song");
			for(String b:optionList) {
				System.out.println(b);
			}
			System.out.println("enter the option");
			int o=sc.nextInt();
			if(o==1) {
				System.out.println("Play all song");
			}
			else if (o==2) {
				System.out.println("Play Random Song");
			}else if(o==3) {
				System.out.println("Play a Particular song");
			}else {
				System.out.println("Please enter valid song");
			}
//System.out.println("play a song");
			for(String l:list){
				System.out.println(l);
		}
			break;
		}case 2:{
			System.out.println("Play a random song");
			Double d=Math.random();
			int random=(int)(d*7);
			System.out.println(list.get(random)+"is playing");
			break;
			
		}case 3:{
			System.out.println("Play a Particular Song");
			
		System.out.println("Enter your choice");
		
			break;
		}
			
		}
	}


	}


