package lab1;

public class Lab1A {

	public static void main(String[] args) 
	{
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));		
	}
	
	public static int sumLimit(int a, int b) 
	{ 
		int sumAB = a + b;
		
		if(sumAB>=10) 
		{
			if(a>b) 
			{
				return a;
			}
			else 
			{
				return b;
			}
		}	
			
		else
		{
			return sumAB;
		}		
	}	
}