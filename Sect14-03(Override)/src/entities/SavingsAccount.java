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
	
	// Método "withdraw" sobrescrito sem a taxa de saque
	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	/**
	 * Métodos passados como herança podem ser sobrescritos. Isso é 
	 * importante, para que, quando um método necessite de alguma 
	 * expecificação diferente do método original de sua superclasse, 
	 * seja possível alterar esse método, de modo que não afete o 
	 * método original da superclasse, o que poderia comprometer
	 * outras subclasses, ou até mesmo a superclasse. Para isso, 
	 * basta reescrever o método na subclasse desejada.
	 */
}
