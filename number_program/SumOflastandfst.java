package number_program;

public class SumOflastandfst {
	public static void main(String[] args) {
		int num=1234,fst,last,sum;
		last=num%10;
		while(num>9)
		{
			num=num/10;
		}
		fst =num;
		sum = last+fst;
		System.out.println(sum);
		
	}

}
