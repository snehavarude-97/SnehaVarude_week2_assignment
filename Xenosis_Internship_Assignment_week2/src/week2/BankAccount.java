/*Implement a BankAccount class with methods for deposit, withdrawal, and displaying the 
account balance.*/
package week2;

public class BankAccount {
	private double balance;
	//Default constructor to initialize balance
	public BankAccount()
	{
		this.balance = 0.0;
	}
	//Parameterised Constructor to initialize with a given balance
	public BankAccount(double intialBalance)
	{
		if(intialBalance >=0)
		{
			this.balance = intialBalance;
		}
		else
		{
			System.out.println("Initial Balance Cannot be Negative");
			this.balance = 0.0;
		}
	}
	//Method to deposit money into account
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Deposited : Rs "+amount);
		}else
		{
			System.out.println("Deposited amount must be positive");
		}
	}
	
	//Method to withdraw money from account
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(amount <= balance)
			{
				balance = balance-amount;
				System.out.println("Withdrawal amount is Rs: "+amount);
			}else
			{
				System.out.println("Insufficient Amount for withdrawal");
			}
		}else
		{
			System.out.println("Withdrawal Amount must be positive");
		}
	}
	//Method to display available balance
	public void displayBalance()
	{
		System.out.println("Current balance is Rs: "+balance);
	}
	
	public static void main(String[] args) {
		//creating object of BankAccount with some intial amount
		BankAccount bankaccount = new BankAccount(1000.0);
		//to // Display the initial balance
        bankaccount.displayBalance();

        // Deposit money into the account
        bankaccount.deposit(50.0);

        // Withdraw money from the account
        bankaccount.withdraw(30.0);

        // Attempt to withdraw more than the balance
        bankaccount.withdraw(1500.0);

        // Display the final balance
        bankaccount.displayBalance();

	}

}
