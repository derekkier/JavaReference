import java.util.Arrays;

public class ArraySamples {
	//updated at 10:28pm
	public static void main(String[] args)
	{
		int[] randomArray;
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random","words","to","display","on","the","screen"};
		
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = i;
		}
	
		for(int i = 0; i < numberArray.length; i++)
		{
				System.out.print("|"+numberArray[i]);
		}
		System.out.println();

		String[][] multiArray = new String[10][10];
		
		for(int i = 0; i < multiArray.length; i++)
		{
			for(int j = 0; j < multiArray[i].length; j++)
			{
				multiArray[i][j] = "|"+i+" "+j;
			}
		}

		//Enhanced for loop - row: Array - similar to a PHP foreach loop.
		for(String[] row: multiArray)
		{
			for(String cell: row)
			{
				System.out.print("|"+cell);
			}
			System.out.println();
		}
		
		for(String row: stringArray)
		{
				System.out.print("|"+row);
		}
		System.out.println();

		for(int row: numberArray)
		{
				System.out.print("|"+row);
		}
		System.out.println();
		
		int[] copyArray = Arrays.copyOf(numberArray, 3);//use numberArray.length instead of 3 for the whole array.
		
		for(int row: copyArray)
		{
				System.out.print("|"+row);
		}
		
		System.out.println();
		
		int[] rangeOfArray = Arrays.copyOfRange(numberArray, 2,5);//use numberArray.length instead of 3 for the whole array.
		System.out.println();

		System.out.println("Copy of range of array.");
		for(int row: rangeOfArray)
		{
			System.out.print("|"+row);
		}
		
		System.out.println("\n");

		System.out.println("Fill array indexes with default value.");
		int[] emptyArray = new int[10];
		System.out.println(emptyArray[2]);
	
		//Fill the array indices with 1 instead of 0
		Arrays.fill(emptyArray, 1);
		for(int row: emptyArray)
		{
			System.out.print("|"+row);
		} 
		System.out.println();

		System.out.println("Create an array that will be sorted.");
		int[] sortArray = new int[100];
		for(int i=0; i< sortArray.length;i++)
		{
			//random 0 - 10
			sortArray[i] = (int)(Math.random()*11); 
			//System.out.println( (int)(Math.random()*11) );
		}
		System.out.println(Arrays.toString(sortArray));
	
		Arrays.sort(sortArray);
		System.out.println(Arrays.toString(sortArray));
		
		System.out.println(sortArray[0]);
		
		System.out.println("Search an array and find the index of the number 1.");
		int indexOfSearch = Arrays.binarySearch(sortArray, 0);
		System.out.println(indexOfSearch);
	}
}
