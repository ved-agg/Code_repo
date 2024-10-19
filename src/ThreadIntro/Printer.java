package ThreadIntro;

public class Printer implements Runnable {

	private int num;
	
	 public Printer(int num) {
		this.num = num;
	}
	
	
	@Override
	public void run() {
		System.out.println("Hello world "+ num + " in Printer " +Thread.currentThread().getName());
		
	}


}
