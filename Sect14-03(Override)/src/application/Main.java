package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
	
	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Roberto Rongo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria do Bairro", 1000.0, 0.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Luz Clarita", 1000.0, 0.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
