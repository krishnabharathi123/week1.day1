package week1.day1;

public class negativeToPositiveNum {

	public static void main(String[] args) {
		int negativeNum = -40;
		int positiveNum;
		if (negativeNum < 0) {
			positiveNum = negativeNum * -1;
			System.out.println("The converted positive number is " + positiveNum);

		} else {
			System.out.println("The number is already positive");

		}

	}

}
