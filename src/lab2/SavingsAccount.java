package lab2;


public class SavingsAccount extends Account //implements Account?
{

	@Override
	public double annualInterest() 
	{		
		return (this.balance * 1.1d);		
	}

}
