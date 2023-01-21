package number_program;
import java.util.Scanner;

public class Sum_Of_Factors {
		static Scanner s= new Scanner(System.in); // to print sum of total number of factors for the given number n
		static int sum = 0;
		public static void main(String []args) {
			
			System.out.println("Enter the number");
			int num = s.nextInt();
			System.out.print("sum of Total number of factors for " + num + " is : " );
			for(int i =1; i<=num;i++) 
				
			{
				if (num%i==0)
				{
					sum=sum+i;
				}
				
	       }
			System.out.print(sum);

	}

}
