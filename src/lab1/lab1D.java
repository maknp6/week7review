package lab1;

public class lab1D 
{
	public static void main(String[] args) 
	{
		System.out.println(countXX("abcxx"));
		System.out.println(countXX("xxx"));
		System.out.println(countXX("xxxx"));
	}
	
		public static int countXX(String givenString)
		{
			int countXX = 0;
			int lengthOfString = givenString.length();
			
			for(int i= 0; i < lengthOfString; i++) 
			{
				if(givenString.substring(i, i + 2).equals("xx")) 
				{
					countXX++;
				}				
			}
			return countXX;				
		}
}
