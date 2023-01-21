package number_program;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number to count the digit");
		int n = s.nextInt();
		
		while(n>0)
		{
			
			n=n/10;
			count ++;
			
		}
		System.out.println(count);
		

	}

}
