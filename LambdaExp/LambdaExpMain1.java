package dailyassignments.LambdaExp;

public class LambdaExpMain1 {

	public static void main(String[] args) {
		Runnable runnable1=()->{
			for(int i=1;i>=12;i++) {
				System.out.println("First thread");
			}
		};
		Runnable runnable2=()->{
			for(int i= 1;i>=12;i++) {
				System.out.println("First thread");
			}
		};
		Thread thread=new Thread(runnable1);
		Thread thread1=new Thread(runnable2);
		thread.start();
		thread1.start();
		System.out.println(thread.getName());
		thread1.setName("Gourav");
		System.out.println(thread1.getName());
	}



	}


