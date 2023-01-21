package stringprograms;

import java.util.Scanner;

public class Frequencyofstring {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the word with repeated letter to count thee occurance");
       String a=sc.next();
       frequency(a);
	}
public static void frequency(String a) {
	String [] str = a.split("");
	int count=0;
	for(int x=0;x<str.length;x++)
	{count=1;
		for(int y=x+1;y<str.length;y++)
		{
			if(str[x].equals(str[y]))
			{
				count++;
				str[y]="o";
			}
			}
		if(str[x]!="o")
			System.out.println(str[x]+"\t"+count+"times");
	}
} 
}
