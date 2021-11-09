package StringClass;

import java.util.Scanner;

public class challenge {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int choice, i, num;
			long fact = 1;
			float a, b, n, m=0, t = 0, avg, perc, sum, prod, diff=0, dividend, divisor, quo, rem;
			System.out.println("\n----------MENU----------");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Average");
			System.out.println("6.Percentage");
			System.out.println("7.Factorial");
			System.out.println("8.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\nEnter first number: ");
				a = sc.nextFloat();
				System.out.println("\nEnter second number: ");
				b = sc.nextFloat();
				sum = a + b;
				System.out.println("Sum of given numbers is: " + sum);
				break;
			case 2:
				System.out.println("\nEnter first number: ");
				a = sc.nextFloat();
				System.out.println("\nEnter second number: ");
				b = sc.nextFloat();
				if (a >= b) {
					diff = a - b;
				} else if (a <= b) {
					diff = b - a;
				}
				System.out.println("The positive difference between the given numbers is: " + diff);
				break;
			case 3:
				System.out.println("\nEnter first number: ");
				a = sc.nextFloat();
				System.out.println("\nEnter second number: ");
				b = sc.nextFloat();
				prod = a * b;
				System.out.println("The product of the given numbers is: " + prod);
				break;
			case 4:
				System.out.println("Enter dividend: ");
				dividend = sc.nextFloat();
				System.out.println("Enter divisor: ");
				divisor = sc.nextFloat();
				quo = divisor / dividend;
				rem= divisor % dividend;
				System.out.println("The quotient of the division is: " + quo);
				System.out.println("The remainder of the division is: " + rem);
				break;
			case 5:
				System.out.println("\nHow many numbers? ");
				n = sc.nextFloat();
				for (i = 1; i <= n; i++) {
					System.out.println("\nEnter " + i + " number: ");
					m = sc.nextFloat();
					t = t + n;
				}
				avg = t / m;
				System.out.println("Average of the given numbers is: " + avg);
				break;
			case 6:
				System.out.println("\nEnter value: ");
				a = sc.nextFloat();
				System.out.println("Out of: ");
				b = sc.nextFloat();
				perc = ((a/100) * a);
				System.out.println(a + " is " + perc + " percent of " + b);
				break;
			case 7:
				System.out.println("\nEnter number: ");
				num = sc.nextInt();
				for (i = 1; i <= num; i++) {
					fact *= i;
				}
				System.out.println("Factorial of the given number is: " + fact);
				break;
			case 8:
				System.out.println("--------GOOD BYE--------");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
