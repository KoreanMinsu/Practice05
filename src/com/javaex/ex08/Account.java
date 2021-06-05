package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
   
    
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) {
		balance = balance - money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	
	public void showInfo() {
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
    //생성자 작성
    
    //필요한 메소드 작성

}
