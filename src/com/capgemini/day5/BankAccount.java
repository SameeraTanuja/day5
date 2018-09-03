package com.capgemini.day5;

public class BankAccount {
	private long accid;
	private String accHolderName;
	private String accType;
	private double balance;
	private DebitCard debitCard;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(long accid, String accHolderName, String accType, double balance, DebitCard debitCard) {
		super();
		this.accid = accid;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
		this.debitCard = debitCard;
	}
	public long getAccid() {
		return accid;
	}
	public void setAccid(long accid) {
		this.accid = accid;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	public double withdraw(double amount) throws LowBalanceException {
		if(balance-amount>=0)
			balance=balance-amount;
		else
			throw new LowBalanceException("You dont have sufficient fund.");
		return balance;
	}

}

