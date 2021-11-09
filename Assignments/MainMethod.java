package JavaBasics;

public class MainMethod {

	public static void main(String[] args) {
		ImplementationClass implementationClass= new ImplementationClass();
		implementationClass.childMethod();
		implementationClass.parentMethod();
		implementationClass.grandChildMethod();
		System.out.println(InterfaceParent.i);
		System.out.println(InterfaceChild.num);
		System.out.println(InterfaceGrandChild.);
		

	}
}
