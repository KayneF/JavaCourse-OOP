package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Account acc = new Account(1001, "Roberto Rongo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Marimar", 0.0, 500.0);
		
		/**
		 * É possível criar uma subclasse do tipo da superclasse com os 
		 * mesmos atributos, ou até mesmo converter uma subclasse já criada, 
		 * em uma variável de sua superclasse.
		 */
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob Ross", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Marlon Brando", 0.0, 800.0);
		
		
		/**
		 * No caso do "downcasting" é um pouco diferente. Uma superclasse 
		 * não pode ser convertida em uma subclasse normalmente, isso é
		 * possível somente utilizando um 'casting'.
		 */
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		// Casting
//		BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;	// Exemplo de casting
			acc5.loan(200);
			System.out.println("Loan successful!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;		// Exemplo de casting
			acc5.updateBalance();
			System.out.println("Update successful!");
		}
		/**
		 * Apenas utilizar um casting, não garante o sucesso na conversão,
		 * nesse caso, é interessante verificar se a instância a ser convertida, 
		 * pertence a mesma classe, ou uma classe compatível com a classe a ser
		 * convertida.
		 */
	}

}
