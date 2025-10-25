package ElementPractice;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//4. Count vowels in a string
		
		String str = "Automation";
		int count = 0;
		for (char c : str.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
			count++;
		
			}
		}
		System.out.println("Vowels: " + count);
	}
}