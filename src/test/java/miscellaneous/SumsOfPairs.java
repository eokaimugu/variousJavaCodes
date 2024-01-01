package miscellaneous;

public class SumsOfPairs{

	public static void main(String[] args) {
		
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i=0; i<numbers.length; i++)
		{
			for (int j=i+1; j<numbers.length; j++)
				
			{

				if (numbers[i] == 9 || numbers[i] + numbers[j] == 9) {

					System.out.println("The numbers that sum up to 9 are: " +numbers[i] + " " + numbers[j]);
				}
			}
		}
		

	}

}
