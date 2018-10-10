// Jasmine Chin 111717723

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public double withDraw(double money) {
		if (super.getBalance() - money < 0) {
			return super.setBalance(0);
		} else {
			return super.setBalance(super.getBalance() - money);
		}
	}
}
