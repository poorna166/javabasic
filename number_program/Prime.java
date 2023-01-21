package number_program;

import java.util.Scanner;

public class Prime {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		do
		{
			System.out.println("Enter the number to Check");
			int num=s.nextInt();
			int count =0;
			if(num==0||num==1)
				System.out.println("neither prime nor composite");
			else {
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
				if(count==2)
					System.out.println("prime");
				else
					System.out.println("composite");
				
		}
			
		}
		while(true);
	}

}
