package ElementPractice;

public class MaximumAndMinimum {

	 public static void main(String[] args) {
		 int[] arr = {3, 5, 1, 8, 2};
		 int max = arr[0], min = arr[0];
		 for (int num : arr) {
		 if (num > max) max = num;
		 if (num < min) min = num;
		 }
		 System.out.println("Max: " + max + ", Min: " + min);
		 }
		}
