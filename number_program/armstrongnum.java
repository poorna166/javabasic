package number_program;

public class armstrongnum {
	public static void main(String[] args) {
		int data = 9474;
		boolean result = toCheckAmstrong(data);
		if (result == true)
			System.out.println("amstrong");
		else
			System.out.println("not amstrong");
	}

	private static boolean toCheckAmstrong(int data) {
		int count = 0, temp = data, product = 1, sum = 0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		temp = data;
		System.out.println(count);
		while (temp > 0) {
			int last = temp % 10;
			for (int i = 1; i <= count; i++) {
				product = product * last;
			}
			sum = sum + product;
			product = 1;
			temp /= 10;
		}

		if (sum == data) {
			return true;
		} else
			return false;
	}
}
