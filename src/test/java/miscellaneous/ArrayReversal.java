package miscellaneous;

public class ArrayReversal {
	/*while(i<=j)
		swap(ar[i], ar[j])
		// i++
		//j--*/

	static void reverse(int[] arr) {
		int i = 0, j = arr.length - 1;//last index of array
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
	}

	public static void main(String[] args) {
		//Reversing a string
		String name = "Eric Okai";

		String temp = "";

		for (int i = name.length()-1; i>= 0; i--) {
			temp += name.charAt(i);
		}

		System.out.println(temp);		
		
		
		// Reversing an array of numbers
		
		int [] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
		}	
		
		System.out.println();
		reverse(arr);
		
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
