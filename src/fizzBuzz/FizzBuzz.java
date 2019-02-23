package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzzPrint();
	}

	public static void FizzBuzzPrint() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(FizzBuzz(i));
		}
	}

	public static String FizzBuzz(int i) {
		String result;
		if (i % 3 == 0 && i % 5 == 0)
			result = "FizzBuzz";
		else if (i % 3 == 0)
			result = "Fizz";
		else if (i % 5 == 0)
			result = "Buzz";
		else
			result = String.valueOf(i);
		return result;
	}
}
