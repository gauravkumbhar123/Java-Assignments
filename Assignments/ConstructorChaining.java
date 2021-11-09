package JavaBasics;

public class ConstructorChaining {
	ConstructorChaining() {
	}
}

class ConstructorChaining2 extends ConstructorChaining {
	int i = 10;

	ConstructorChaining2(int i) {
		super();
	}
}

class mainmethod
{

	public static void main(String[] args) {
		ConstructorChaining2 ConstructorChaining2 = new ConstructorChaining2(10);

	}
}
