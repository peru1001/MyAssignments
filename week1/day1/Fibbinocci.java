package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// Print Fibbinocci for first 11 numbers
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println("Fibinocci Series: ");
		for (int i = 1; i <= 11; i++) {
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}

}
