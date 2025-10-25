package ElementPractice;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Find the duplicate elements in an array
		int arr[] = {1,2,3,4,1,8,9,4}; 
		for (int i = 0 ; i< arr.length ; i++) {
			for (int j = i+ 1; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate: " + arr[i]);
				}
			}
		}
	}

}
