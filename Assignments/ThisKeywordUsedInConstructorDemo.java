package JavaBasics;

public class ThisKeywordUsedInConstructorDemo {
	String name="Gourav";
	int age=100;
	public ThisKeywordUsedInConstructorDemo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void print(String name) {
		System.out.println(name);
		System.out.println(this.name);
	}
	

}
