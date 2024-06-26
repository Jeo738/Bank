package com.Bank.Banco.entities;

public class EstudoHeranca3 extends EstudoHeranca1 {
	private double interestRate;

	public EstudoHeranca3() {
		super();
	}

	public EstudoHeranca3(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
}
