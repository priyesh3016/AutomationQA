package ElementPractice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Check if a string is a palindrome
		
		String str = "madam";
		String reversed  = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reversed)) {
			System.out.println("palidrome");
		}else {
			System.out.println("Not a palidrome");
		}
			
		
	}

}
