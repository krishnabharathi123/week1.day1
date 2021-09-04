package week1.day1;

public class FibnocciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int range = 8;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 2; i < range; i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}

	}
}
