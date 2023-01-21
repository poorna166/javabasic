package number_program;

public class fibonacci {

	public static void main(String[] args) {
		int num=10;
		int f=0,s=1,t;
		System.out.print(f+" "+s+" ");
		
        for(int x=2;x<=num;x++)
        {
        	t=f+s;
          System.out.print(t+" ");
        	f=s;
        	s=t;
        }
       
	}

}
