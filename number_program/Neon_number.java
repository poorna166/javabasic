package number_program;

public class Neon_number {

	public static void main(String[] args) {
		//sum of square of the number is it self
		int num=9,res;
		
		res=sumofsqrvalue(num);
		if(res==num) 
		System.out.println("The number("+num+")given is a neon number");
		else
			System.out.println("The number"+num+"given is not a neon number");
		
		
	
	}
		//method to add sum of square number
	public static int sumofsqrvalue(int given)
	{
		given=given*given;
		int lst,sum=0;

		while(given>0) {
			lst =given%10;
			sum =sum+lst;
			given=given/10;
		}
	return sum;}


}
