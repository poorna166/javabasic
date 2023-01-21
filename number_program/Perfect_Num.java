package number_program;

public class Perfect_Num {

	public static void main(String[] args) {
		int num =28,sum=0;
		
         for (int x=1;x<num;x++)
         {
        	 if(num%x==0)
        		sum+=x; 
         }
         
         if(sum==num)
        	 System.out.println("Perfect Number");
         else
        	 System.out.println("Not a perfect number");
	}

}
