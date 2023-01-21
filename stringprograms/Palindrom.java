package stringprograms;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word");
    String a=sc.next();
   boolean result= palindromCheck(a);
    if(result)
    	System.out.println("palindrom");
    else
    	System.out.println("not a palindrom");
    
}
   public static boolean palindromCheck(String p) {
	   String b="";
	   
	   for(int a=p.length()-1;a>=0;a--)
	   {
		   
		   b+=p.charAt(a);
	   }
   
   
   if(b.equals(p))
	   return true;
   return false;}
   
}
