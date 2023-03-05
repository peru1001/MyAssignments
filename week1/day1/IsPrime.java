package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// Print all prime numbers
		int number =7;
		for (int i = 2; i <= number/2; i++) {
			if (number%i==0) {
			System.out.println("the given number "+ number + " is Not Prime");break;	
			} else {
			System.out.println("The given number " + number + " is Prime");	break;
			}
			
		}

	}

}
