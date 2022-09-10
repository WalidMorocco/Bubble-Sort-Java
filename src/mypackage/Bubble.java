package mypackage;

public class Bubble {
	
	int[] data = {1, 2, 3, 4, 5, 7 };

	public int[] sort() {
		
		int len = data.length;
		
		for (int pass = 1; pass < len; pass++) {
			System.out.println("Pass = " + pass);
			for (int compares = 0; compares < len - pass; compares++) {
				System.out.println(compares);
				if (data[compares] < data[compares + 1]) {
					// Swap
					int temp = data[compares];
					data[compares] = data[compares + 1];
					data[compares + 1] = temp;
				}
			}
		}
		return data;
	}
	
	public void printData() {
		for (int i=0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The unsorted order:");
		Bubble bubble = new Bubble();
		bubble.printData();
		
		bubble.sort();
		
		System.out.println("The sorted order:");
		bubble.printData();
		
	}
}
