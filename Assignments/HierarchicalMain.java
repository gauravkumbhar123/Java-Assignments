package com.technoelevate.javabasics;

public class HierarchicalMain {

	public static void main(String[] args) {
	HierarchicalInheritanceChild b = new HierarchicalInheritanceChild();
    
        b.dispB();
        
        b.dispA();
      
        HierarchicalInheritanceGrandChild c = new HierarchicalInheritanceGrandChild();
        
        c.dispC();
        
        c.dispA();
    
        HierarchicalInheritanceGreatGrandChi d = new HierarchicalInheritanceGreatGrandChi();

        d.dispD();
        d.dispA();

	}

}
