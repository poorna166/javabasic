package stringprograms;

public class Anagram {
	public static void main(String[] args) {
		String s1="nhgf";
		String s2="fghn";
		int count=0;
		if(s1.length()==s2.length()) {
		for(int x=0;x<s1.length();x++)
		{
			for (int y = 0; y < s2.length(); y++) {
				if(s1.charAt(x)==s2.charAt(y))
					count++;
			}
		}
		if(s1.length()==count)
			System.out.println("angram");
		else
			System.out.println("not anagram");
		}
		else
			System.out.println("check");
		}
	

}
