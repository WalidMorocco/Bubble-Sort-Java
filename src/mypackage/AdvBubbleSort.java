package mypackage;

public class AdvBubbleSort {
	int[] data = {4, 3, 1, 9 };

	public int[] sort(int[] data) {
		
		int len = data.length;
		boolean nextPass = true; // Set while() parameter to true to initiate it
		int pass = 0;
		int count = 0;
		
		while (nextPass) {
			pass ++;
			nextPass = false; // Set the parameter to false in case the array is sorted
			System.out.println("Pass = " + pass);
			for (int compares = 0; compares < len - 1; compares++) {
				
				count ++;
				System.out.println(compares);
				if (data[compares] < data[compares + 1]) {
					
					// Swap
					int temp = data[compares];
					data[compares] = data[compares + 1];
					data[compares + 1] = temp;
					nextPass = true; // Set it back to true because if we reached this step then the array is not sorted
				}
			}
			
		}
		System.out.println("le countzer:" + count);
		return data;
	}
	
	public void printData() {
		for (int i=0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The unsorted order:");
		AdvBubbleSort bubble = new AdvBubbleSort();
		bubble.printData();
		
		bubble.sort(bubble.data);
		
		System.out.println("The sorted order:");
		bubble.printData();
		
	}
}
