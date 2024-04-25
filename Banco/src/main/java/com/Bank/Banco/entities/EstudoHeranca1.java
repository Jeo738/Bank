package com.Bank.Banco.entities;

public class EstudoHeranca1 {
 
	private int number;
	private String holder;
	protected double balance;
	
	public EstudoHeranca1() {
		
	}

	public EstudoHeranca1(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
}
