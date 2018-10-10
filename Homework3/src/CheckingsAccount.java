
public class CheckingsAccount extends Account {
	private double overdraftlimit;
	
	public CheckingsAccount() {
		super();
	}
	
	public CheckingsAccount(int id, double balance, double limit) {
		super(id, balance);
		overdraftlimit = limit;
	}
	
	public double getLimit() {
		return overdraftlimit;
	}
	
	public double setLimit(double limit) {
		return overdraftlimit = limit;
	}
	
	public double withDraw(double money) {
		if ((super.getBalance() - money) < -1*overdraftlimit) {
			return -1*overdraftlimit;
		} return super.withDraw(money);
	}

}
