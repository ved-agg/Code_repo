package Adapter;

public interface BankApi {

	public double getBalance(String accountNumber);
	
	public boolean sendMoney(String fromacc, String toAcc, String amt);
}
