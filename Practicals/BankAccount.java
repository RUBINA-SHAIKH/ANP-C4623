package corejava;

public class BankAccount 
{
//initializing the variables of class
private double balance;
private String accountNumber;
//add a parameterized constructor
public BankAccount(double balance, String accountNumber) {
	super();
	this.balance = balance;
	this.accountNumber = accountNumber;
}

// add a getter & setter method
public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}


public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

// create a deposit method
public void deposit(double amount)
{
	amount = amount + balance;
	System.out.println("" +amount);

	
	
	}
//creating a withdraw method
public void withdraw(double amount)
{
	amount = balance - amount;
	System.out.println("" +amount);


}
public static void main(String[]args)
{
//creating a instance of object of a BanckAccount class
BankAccount ba=new BankAccount(1000 ,"123456" );
// calling the methods 
ba.getBalance();
ba.getAccountNumber();
ba.deposit(500);
ba.withdraw(200);
ba.getBalance();
}


}
