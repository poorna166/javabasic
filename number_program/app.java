package number_program;
import java.util.Scanner;
public class app
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)throws Exception
		
{
		System.out.println("welcome you to  java program ");
		System.out.println("Features we Have \n1.calculater\n2.Number Program\n3.pattern program\n4.food order(by tomato app)\n");
        

	switch (scan.nextInt()){
	
	case 1 :{		
		  calculater();
		
	break;}
	case 2 :{System.out.println("which type of number program you want ?  \n1.Factors of a given number\n2.Total number of factors\n3.Sum of total factors\n4.EVEN (or) ODD\n5.perfect num or not\n6.Largestof two number\n7.Largest of three number");
	       	
		switch (scan.nextInt())
		{
		case 1:	{
			System.out.println("You seleted: Factors of a given number");
			factors_of_Given_num();
		break;}
		case 2: {
               System.out.println("You seleted:Total number of factors");
			Total_number_of_factors();
		break ;}
		case 3:{
			Sum_of_total_factors();
		break;}
		case 4:{
			EvenOdd();
		break;}
		case 5:{
			Perfect_Num_Or_Not();
		break;}
		case 6:{
			Largest_Of_Two_Number();
		break;}
		case 7:{
			Largest_Of_Three_Number();
		break;}
		
		
	}
	break;}
	case 3 :{System.out.println("Welcome to Patten programming");
		
		  	System.out.println("what type of number program you need ? \n1.Square \n2.Backward increasing triangle\n3.Backward decreasing triangle\n4.Forward decreasing triangle\n5.Forward increasing triangle  ");
             
		  switch (scan.nextInt())
		  {
		  case 1:{
           Square();
		 break;}
		 case 2:{
         Backward_increasing_triangle();
		 break;}
		  case 3:{
         Backward_decreasing_triangle();
		 break;}
		 case 4:{
         Forward_increasing_triangle();
		 break;}
		 case 5:{
         Forward_decreasing_triangle();
		 break;}

 		  }   
	}
	case 4 :{
		food_order();
		break;}
	
	   }
	}

	public static void calculater() {
	
		System.out.println("welcome to calculater app");
         System.out.println("Enter The First Number");
		double value1 = scan.nextInt();
		 System.out.println("Enter The Second Number");
		double value2 = scan.nextInt();
		System.out.println("\tWhat Operation Need To Be Down To the Above Number \n1.addition\n2.subtration\n3.division\n4.Multiplication\n5.modules");
		int operation = scan.nextInt();
        switch (operation)
        {
        case 1:{
			System.out.println("Sum Of The Value " + value1 +"+"+ value2+ "is = "+add (value1,value2));
			
        break;}
		case 2: {
			System.out.println("subtration Of The Value " + value1 +"-"+ value2+ "is = "+ sub(value1,value2));
		break;}
			case 3: {
			System.out.println("Division Of The Value " + value1 +"/"+ value2+ "is = "+ div(value1,value2));
		break;}
case 4: {																																																																																																																																																																																																																													
			System.out.println("Multiplication  Of The Value " + value1 +"*"+ value2+ "is = "+mul(value1,value2));
		break;}
case 5: {
			System.out.println("Remainder Of The Value " + value1 +"%"+ value2+ "is = "+mod(value1,value2));
		break;}
		}

	return ;}
	
	public static double add(double a,double b){
		return a+b;
		}
	public static double mul(double a,double b){
		return a*b;
		}
		static double sub(double a,double b){
		return a-b;
	}
    static double div(double a,double b){
		return a/b;
	}
	static double mod(double a,double b){
		return a%b;
	}
	
	//methods to call are given below
	public static void factors_of_Given_num()
	 {
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.print("factors of " + num + " are : ");
		for(int i =1; i<=num;i++) 
			
		{
			if (num%i==0)
			{
				System.out.print(i+",");
			}
			
		}	
return ;}
public static int Total_number_of_factors() {
	    int count = 0;
		 System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.print("Total number of factors for " + num + " is : ");
		for(int i =1; i<=num;i++) 
			
		{
			if (num%i==0)
			{
				count++;
			}
			
       }
		System.out.println(count);
	
return 5;}
public static int Sum_of_total_factors(){
	        int sum = 0;
         	System.out.println("Enter the number");
			int num = scan.nextInt();
			System.out.print("sum of Total number of factors for " + num + " is : " );
			for(int i =1; i<=num;i++) 
				
			{
				if (num%i==0)
				{
				  sum   = sum+i;
				}
				
	       }
			System.out.print(sum);
return 5;}
public static void EvenOdd(){
   	  System.out.println("input a number to find the number is even or odd");
	int given = scan.nextInt();
		if ( given%2==0)
     	     System.out.println("The number you given "+given+"is a \"'Even Number'");
			
	    else
      	     System.out.println("The number you given "+given+"is a \"'ODD Number'");
		
return ;}

public static void Perfect_Num_Or_Not(){
	       int sum = 0;
	        System.out.println("Enter the number");
			int num = scan.nextInt();
			for(int i =1; i<num;i++) 
				
			{
				if (num%i==0)
				{
					sum=sum+i;
				}
				
	       }
			if (sum==num)
			{
				System.out.print("Is a perfect number");
			}
			else
			{
				System.out.print("Is not  a perfect number");
			}
	
return;}
public static void Largest_Of_Two_Number(){
	        System.out.println("Enter First  number");
			int num1 = scan.nextInt();
            System.out.println("Enter Second number");
			int num2 = scan.nextInt();
			if(num1>num2)
	{
		System.out.println(num1 +"is greatest number");
			
	}
	else 
		{
       	System.out.println(num2 +"is greatest number");
	     }
	
return;}
public static void Largest_Of_Three_Number(){
	        System.out.println("Enter First  number");
			int num1 = scan.nextInt();
            System.out.println("Enter Second number");
			int num2 = scan.nextInt();
			 System.out.println("Enter third number");
			 int num3 = scan.nextInt();
			 System.out.println("THE NUMBER THAT  YOU ENTERED ARE" + num1+ ","+num2+","+num3);


			if(num1>num2&&num1>num3)
	{
		System.out.println(num1 +"is greatest number");
			
	}
	else if (num2>num3&&num2>num1)
	{
		System.out.println(num2 +"is greatest number");
	}
		else 
		{
       	System.out.println(num3 +"is greatest number");
	     }
	
return;}
public static int Square() {
	System.out.println("Give the value for side of the square");
		int n =scan.nextInt();
		
		for (int i = 0; i<n; i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (true)
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	return 5;}
	public static void  Backward_increasing_triangle(){
	System.out.println("for example  IF you enter 5 then the patten will be like below "   );

		ex(5);
		System.out.println("Enter The the backward increasing value you need ");
		int num =scan.nextInt();

		for (int i=0;i<=num ;i++ )
		{
			for (int j=0;j<=num ;j++ )
			{
				if (i>=j )
				{	
  			System.out.print("* ");
			}
			else
				{
			System.out.print(" ");
			}
			 

			}
				System.out.println();

		}
		
	return;}
	public static int  ex(int num){
	for (int i=0;i<=num ;i++ )
		{
			for (int j=0;j<=num ;j++ )
			{
				if (i>=j )
				{	
  			System.out.print("* ");
			}
			else
				{
			System.out.print(" ");
			}
			 

			}
				System.out.println();

		}
	return 5;}

public static void  Backward_decreasing_triangle(){
		System.out.println("Enter the value for backward  decreasing triangle");
		int num =scan.nextInt();
		for (int i=0;i<=num ;i++ )
		{
			for (int j=0;j<=num ;j++ )
			{
				if (i<=j)
				{	
  			System.out.print("* ");
			}
			else
				{
			System.out.print("  ");
			}
			

			}
				System.out.println();

		}
return;}
public static void  Forward_increasing_triangle(){
	
	System.out.println("Enter the value for forward increasing trianngle");
		int num =scan.nextInt();
		for (int i=0;i<=num ;i++ )
		{
			for (int j=0;j<=num ;j++ )
			{
				if (i+j>=num-1)
				{	
  			System.out.print("* ");
			}
			else
				{
			System.out.print("  ");
			}
			

			}
				System.out.println();

		}
return;

}
public static void  Forward_decreasing_triangle(){
	System.out.println("Enter the value for forward decreasing trianngle");
		int num =scan.nextInt();
		for (int i=0;i<=num ;i++ )
		{
			for (int j=0;j<=num ;j++ )
			{
				if (i+j<=num-1)
				{	
  			System.out.print("* ");
			}
			else
				{
			System.out.print("  ");
			}
			

			}
				System.out.println();

		}

	
return;}
public static void food_order()throws Exception
	{
		System.out.println("welcome to Chandran's SAMAYALS");
        System.out.println("choose the location");
       	System.out.println("1.chennai\n2.kerala\n3.panjab//4.Delhi");
       
        switch (scan.nextInt())
        {
        case 1 :System.out.println("THANK YOU FOR CHOOSING CHENNAI"); 
          System.out.println("FOOD AVILABLE WE HAVE \n 1.meals\n 2.fried rice\n 3.sambar");
          int food = scan.nextInt();
          switch (food)
          {
          case 1: System.out.println("YOUR SELECTED FOOD MEALS");
            System.out.println("SELECT THE QUANTITIY");
            int qyt = scan.nextInt();
            int cost = 70;
            double bill = qyt*cost;
             System.out.println("Your bill AMOUNT is = " + bill);
             Thread.sleep (1000);
             System.out.println("processing for payment");
             System.out.println("mode of  payment \n 1.google pay\n 2.paytm");
             int pay = scan.nextInt();
              
             switch (pay)
             {
             case 1 :{ System.out.println("Welcome to gpay");
                      System.out.println("Enter the bill amount" + bill);
                   int billres = scan.nextInt();
                      
                  if (bill == billres )
                  {
                  System.out.println("verified");

                  } 
                else 
               System.out.println("invalid input");
                
                System.out.println("Enter the OTP");
               double d =(Math.random()*9999)+9999;
               int sys_gen = (int)d;
                System.out.println(sys_gen);
               int user_otp = scan.nextInt();
                if(user_otp == sys_gen)
                   {
                      Thread.sleep(2500);
					System.out.println("verified \n your order is successfully Done \n have your food "  );

                    }
                 else
					System.out.println("not verified");
			break; 
			}
 case 2:  {System.out.println("Welcome to paytm");
                      System.out.println("Enter the bill amount" + bill);
                   int billres1 = scan.nextInt();
                      
                  if (bill == billres1 )
                  {
                                   System.out.println("verified");

                  } 
                else 
               System.out.println("invalid input");
                
                System.out.println("Enter the OTP");
               double f =(Math.random()*9999)+9999;
               int sys_gen1 = (int)f;
                System.out.println(sys_gen1);
               int user_otp1 = scan.nextInt();
                if(user_otp1== sys_gen1)
                   {
                      Thread.sleep(2500);
					System.out.println("verified \n your order is successfully Done \n have your food "  );
                      }
			   else
					System.out.println("not verified");
            break ;
            }

}
        case 2 :System.out.println("THANK YOU FOR CHOOSING kerala"); 
break; 
        case 3 :System.out.println("THANK YOU FOR CHOOSING panjab");  
break;                                     
        case 4 :System.out.println("THANK YOU FOR CHOOSING Delhi");  
break;

		}
	
	
	}

return;}
}












