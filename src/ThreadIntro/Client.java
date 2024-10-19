package ThreadIntro;

public class Client {

	public static void main(String[] args) {
		//System.out.println("Hello world "+ Thread.currentThread().getName());
		for(int i=1;i<=100;i++) {
			Printer p = new Printer(i);
			Thread th = new Thread(p);
			th.start();
			//th.run();
		}
		
//		Thread t1 = new Thread(new Printer(2));
//		t1.start();
	}

}
