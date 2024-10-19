package Adapter;

import Adapter.thirdParty.IciciBankApi;

public class IciciBankAdapter implements BankApi{

	private IciciBankApi iciciBankApi = new IciciBankApi();
	@Override
	public double getBalance(String accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sendMoney(String fromacc, String toAcc, String amt) {
		// TODO Auto-generated method stub
		return false;
	}

}
