package com.basicqueations;

public class BankData {
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		System.out.println(a.getAccNo()); // getter
		a.setAccNo(30);
		a.setAccHldName("shraddha");
		a.setBalance(400000);
		System.out.println(a.getAccNo());
		System.out.println(a.getAccHldName());
		System.out.println(a.getBalance());

	}
}
