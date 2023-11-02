package com.serilization;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUid=1234566789l;
	
	private String name;
	private long crn;
	transient private float balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCrn() {
		return crn;
	}
	public void setCrn(long crn) {
		this.crn = crn;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Customer(String name, long crn, float balance) {
		super();
		this.name = name;
		this.crn = crn;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", crn=" + crn + ", balance=" + balance + "]";
	}
	
	

}
