
public class BankAccount {
	int time;
	String accountNumber;
	int balance;
	double roi;
//	
//	getSimpleInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return Simple Interest as a double.
//			getBalanceWithInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return a new balance (including simple interest) as a double.
	public double getSimpleInterest(int time) {
		return balance*roi*time/100;
	}
	
	public double getBalanceWithInterest(int time) {
		return balance+getSimpleInterest(time);
	}
}
