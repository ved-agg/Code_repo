package Adapter;

public class PhonePe {
	
	private BankApi bankApi;
	
	PhonePe(BankApi bankApi){
		this.bankApi = bankApi;
	}
	
	public void doSomething() throws InterruptedException{
		double currentBalance = bankApi.getBalance("1");
		Thread.sleep(24*60*60*1000);
		
	}
}
