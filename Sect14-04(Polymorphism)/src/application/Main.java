package application;

import entities.Account;
import entities.SavingsAccount;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Polimorfismo, é quando criamos uma variável de um tipo, porém,
		 * ela aponta para um objeto diferente do mesmo tipo (subclasse),
		 * possibilitando comportamentos diferentes de acordo com sua
		 * instância no tempo de execução.
		 */
		Account x = new Account(1001, "Roberto Rongo", 1000.0);
		Account y = new SavingsAccount(1002, "Maria do Bairro", 1000.0, 0.0);
		
		x.withdraw(50);
		y.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
