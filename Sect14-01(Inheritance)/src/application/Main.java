package application;

import entities.BusinessAccount;

public class Main {

	public static void main(String[] args) {

		BusinessAccount ba = new BusinessAccount(
				2021, "Roberto Rongo", 2000.0, 1000.0);
		
		System.out.println(ba.getNumber());
		System.out.println(ba.getHolder());
		System.out.println(ba.getBalance());
		
	}

}
