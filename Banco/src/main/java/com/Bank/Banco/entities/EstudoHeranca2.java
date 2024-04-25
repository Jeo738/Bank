package com.Bank.Banco.entities;

public class EstudoHeranca2 extends EstudoHeranca1 {

	private double loanLimit;

	public EstudoHeranca2() {
		super();
	}

	public EstudoHeranca2(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		loanLimit = loanLimit;
	}

	public double getloanLimit() {
		return loanLimit;
	}

	public void setloanLimit(double loanLimit) {
		loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
		;
	}

}
