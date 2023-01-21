package stringprograms;

import java.util.Scanner;

public class Reversthestring {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a word");
		String ip = sc.next();

		String revword = reverse(ip);
		System.out.println(revword);
	}

	public static String reverse(String d) {
		String rev = "";
		for (int x = d.length() - 1; x >= 0; x--) {
			rev += d.charAt(x);
		}
		return rev;
	}

}
