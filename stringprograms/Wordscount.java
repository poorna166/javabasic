package stringprograms;

public class Wordscount {

	public static void main(String[] args) {
		
String s="hi i am good , hi i am bad";
//                      _  _ _


String[]ca=s.split(" "); 
	



	  
		
		int count = 0;
		for (int i = 0; i < ca.length; i++) {
			count = 1;
			for (int j = i + 1; j < ca.length; j++) {
				if (ca[i].equals(ca[j])) {
					ca[j] = "_";
					count++;
				}
			}
			if(ca[i]!="_"){
			System.out.println(ca[i]+"\t"+count+"times");}
	}
}
}
		