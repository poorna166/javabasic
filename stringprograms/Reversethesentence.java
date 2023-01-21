package stringprograms;

import java.util.Scanner;

public class Reversethesentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Sentence");
		String a = sc.nextLine();//hi how are you 
		
		
		String rev=reverse(a);
		
		
		System.out.println(rev);
	}
	
	public static String reverse(String d) { //hi how are you 
		
		String sentrev=revs(d);////you are how hi;
		String rev = "";
		for (int x = sentrev.length() - 1; x >= 0; x--) {
			rev += sentrev.charAt(x);
		}
		return rev;} //uoy era woh ;}

	public static String revs(String a){//hi how are you{
		String[] r = a.split(" ");
		String rev = "";
		for (int x = r.length - 1; x >= 0; x--) {
			rev = rev + r[x] + " ";
		}

		return rev; //you are how hi;

	}
}
