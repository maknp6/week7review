package lab2;

public abstract class Account 
{		
	protected double balance;
	
	protected Account() 
	{			
	}
	
	protected Account(double balance) 
	{			
		this.balance = balance;			
	}
	
	
	
	
	public double deposit(double depositAmt) 
	{			
		return this.balance + depositAmt;			
	}
	
	public double withdrawal(double withdrawalAmt) 
	{			
		return this.balance - withdrawalAmt;			
	}			
	
	public abstract double annualInterest();
	
}

