package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 13;
		boolean flag = false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println("The given number is a prime number");
		} else {
			System.out.println("The given number is not a prime number");

		}
	}

}
