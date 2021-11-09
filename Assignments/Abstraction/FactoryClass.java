package com.technoelevate.javabasics.Abstraction;

public class FactoryClass {
	Browser browser=null;
	
	public Browser getBrowser(String name) {
		if(name.equalsIgnoreCase("Chrome")) {
			browser=new Chrome();
		}else if(name.equalsIgnoreCase("Safari")) {
	browser=new Safari();
	}else if(name.equalsIgnoreCase("Mozilla")) {
		browser=new Mozilla();
	}else {
		browser=new Opera();
	}
		return browser;
		
	}

	

}
