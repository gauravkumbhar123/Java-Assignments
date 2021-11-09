package JavaBasics;

		import java.util.Scanner;
		public class Friend1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Hello\nCan you give me her Number : ");
			long l=sc.nextLong();
			if(l>6000000000l &&l<9999999999l) {
				 System.out.println(" yes,but this number is not reachable");
			}
			else {
				System.out.println("give me the Valid Mobile Number");
			}
		}
		}


