package number_program;
public class palindrom 
{
	public static void main(String[] args) 
	{

		int number = 121, reverse,copy,last;
         reverse = 0;
		 copy = number;

        while(number>0)
		{
			last  = number%10;
			reverse = (reverse*10)+last;
			number = number/10;
		}
		if (copy==reverse)
		{
			System.out.println("the give numm is palindrom");
		}
		else
			System.out.println("The given  num is not a palindrom");



		System.out.println("Hello World!");
	}
}
