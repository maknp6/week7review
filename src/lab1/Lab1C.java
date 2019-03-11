package lab1;

public class Lab1C {

	public static void main(String[] args) 
	{
		System.out.println(greenLotto(1, 2, 3));
		System.out.println(greenLotto(2, 2, 2));
		System.out.println(greenLotto(1, 1, 2));
	}

	public static int greenLotto(int a, int b, int c) 
	{
		int result;
		
		if((a == b) && (a == c))
		{
			result = 20;
		}
		else if ((a==b) || (a==c) || (b==c)) 
		{
			result = 10;
		}
		else 
		{
			result = 0;
		}
		return result;
	}
}
