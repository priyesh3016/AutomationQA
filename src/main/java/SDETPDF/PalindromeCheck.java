package SDETPDF;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Is palindrome: " + input.equals(reversed));

	}

}
