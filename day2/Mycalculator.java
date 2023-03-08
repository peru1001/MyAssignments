package week1.day2;

public class Mycalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Addition:" + obj.add(5, 5, 5));
		System.out.println("Multiplication: "+ obj.mul(6, 6));
		obj.sub();
	

	}

}
