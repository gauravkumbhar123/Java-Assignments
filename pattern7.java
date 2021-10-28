
public class pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int num=1;
			char ch='a';
			for(int j=1;j<=5;j++) {
				if(j%2==0) {
					System.out.print(" "+ch);
					ch++;
				}
				else {
					System.out.print(" "+num);
					num++;
				}
			}
			System.out.println();
		}
	}
}

