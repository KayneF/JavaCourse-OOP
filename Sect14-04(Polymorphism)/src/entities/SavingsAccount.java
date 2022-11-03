package entities;

public class SavingsAccount extends Account {

	private Double interestRating;
	
	public SavingsAccount() {}
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRating) {
		super(number, holder, balance);
		this.interestRating = interestRating;
	}
	
	public Double getInterestRating() {
		return interestRating;
	}
	public void setInterestRating(Double interestRating) {
		this.interestRating = interestRating;
	}
	
	
	public void updateBalance() {
		this.balance += this.balance * this.interestRating;
	}
	

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
