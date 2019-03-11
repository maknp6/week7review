package lab1;

public class Lab1E 
{
	public static void main(String[] args) 
	{
		System.out.println(stringTimes("Hi", 2));
		System.out.println(stringTimes("Hi", 3));
		System.out.println(stringTimes("Hi", 1));
	}	
	
	public static String stringTimes(String original, int times) 
	{
		String stringTimes = "";
		for(int i = 1; i <= times; i++) 
		{
			stringTimes += original;	
		}		
		return stringTimes;		
	}
}
