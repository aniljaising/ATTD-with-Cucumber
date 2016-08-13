package operations;

public class ATMCalculator {
	private int currentBalance;
	
	public void setCurrentBalance(int amount){
		currentBalance = amount;
	
	}
	public void withdraw(int withdrawal){
		currentBalance = currentBalance - withdrawal;
	}

	public int getCurrentBalance(){
		return currentBalance;
	}

}