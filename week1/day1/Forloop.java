package week1.day1;

public class Forloop {

	public static void main(String[] args) {
		// Print odd numbers from 1 to 20
		System.out.println("Odd Numbers");
		for (int i = 1; i <= 20 ; i++) {
			if (i%2 == 1) {
				System.out.println(i); 
			}
		}
		System.out.println("Even Numbers");
		// Print even numbers from 1 to 20
				for (int i = 1; i <= 20 ; i++) {
					if (i%2 == 0) {
						System.out.println(i); 
					}
				}
	}

}