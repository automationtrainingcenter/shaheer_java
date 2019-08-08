package encapsulation;

import java.util.Scanner;

public class Account {

	private int accNum;
	private String name;
	private String address;
	private String phoneNum;
	private double balance;
	private String password;

	public Account(int accNum, String name, String address, String phoneNum, double balance) {
		this.accNum = accNum;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.balance = balance;
		setPassword();
	}

	private void setPassword() {
		Scanner sc = null;
		if (this.password == null) {
			sc = new Scanner(System.in);
			System.out.println("enter your password");
			this.password = sc.next();
			System.out.println("password created successfully");
		} else {
			System.out.println("enter your old password");
			String oldPass = sc.next();
			if (this.password.equals(oldPass)) {
				System.out.println("enter your new password");
				this.password = sc.next();
				System.out.println("password changed successfully");
			}
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("enter your password to change the address");
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		if (this.password.equals(pass)) {
			System.out.println("changing address...");
			this.address = address;
		}else {
			System.out.println("incorrect password");
		}
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAccNum() {
		return accNum;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// change password
	public void changePassword() {
		setPassword();
	}

}
