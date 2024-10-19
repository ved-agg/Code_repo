package Adapter;

import Adapter.thirdParty.YesBankApi;

public class YesBankAdapter implements BankApi{

	private YesBankApi yesBankApi = new YesBankApi();
	@Override
	public double getBalance(String accountNumber) {
		return yesBankApi.checkBalance(Integer.parseInt(accountNumber));
	}
	@Override
	public boolean sendMoney(String fromacc, String toAcc, String amt) {
		try {
			yesBankApi.transfer(Integer.parseInt(fromacc), Integer.parseInt(toAcc), Integer.parseInt(amt));
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
	}


}
