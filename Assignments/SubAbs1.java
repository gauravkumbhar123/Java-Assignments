package JavaBasics;

 public class SubAbs1 extends Abs1 {
	public SubAbs1(int i) {
	super(i);
	}
	
	public void dispaly() {
	System.out.println("Concrete method in sub class");
	
}

	@Override
	public void add() {
		System.out.println("add()");
		
	}
}

