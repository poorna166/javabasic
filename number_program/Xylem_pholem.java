package number_program;

public class Xylem_pholem {
	public static void main(String[] args) {

		int num = 1234, lastsum = 0, temp = num, innersum = 0;

		while (temp != 0) {
			if (temp == num || temp < 10) {
				lastsum = lastsum + temp % 10;
			} else
				innersum = innersum + temp % 10;
			temp /= 10;
		}
		System.out.println(lastsum);
		System.out.println(innersum);
		if(innersum==lastsum) {
			System.out.println("it is xylem");
		}

	}

}