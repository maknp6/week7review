package lab1;

public class Lab1B {

	public static void main(String[] args) 
	{
		System.out.println(squirrelPlay(70, false));
		System.out.println(squirrelPlay(95, false));
		System.out.println(squirrelPlay(95, true));
	}

	public static boolean squirrelPlay(int temperature, boolean isSummer) 
	{
		boolean arePlaying;
		
		if(isSummer) 
		{
			if (temperature>=60 && temperature <=100) 
			{
				arePlaying = true;				
			}
			else 
			{
				arePlaying = false;
			}
		}
		else
		{
			if(temperature>=60 && temperature <=90) 
			{
				arePlaying = true;
			}
			else 
			{
				arePlaying = false;
			}
		}			
		return arePlaying;
	}	
}
