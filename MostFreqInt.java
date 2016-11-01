public class MostFreqInt {	
    public static void getMostFreqNumber(int[] numbersEntered)
	{
	    //Most frequent number begins at index of 0
		int mostFreqNumber = numbersEntered[0];
		//Highest count is used to keep track of the current highest count, automatically starts at 1 for number at index 0
		int highestCount = 1;
		//countNumber is used to count the occurence of a number in the for loop
		int countNumber;
		//Outer for loop to check the number to be counted
		for(int i = 0; i < numbersEntered.length - 1; i++)
		{
			//Automatically starts at 1 to count the number at i
			countNumber = 1;
			//Second for loop to compare the numbers
			for(int j = 1; j < numbersEntered.length; j++)
			{
				if(numbersEntered[i] == numbersEntered[j])
				{
					//Increment countNumber if the number occurs again
					countNumber++;
				}
			}
			//reassign the value of the most frequent number if a new number occurs more times
			if(countNumber > highestCount)
			{
				highestCount = countNumber;
				mostFreqNumber = numbersEntered[i];				
			}
			//Exit the loops if highest count is greater than the amount of numbers left to reduce number of loops
			if(highestCount > (10 - i))
			{
				System.out.println("Exited early!!");
				break;
			}
		}
		//Print out the answer to the command line to inform the user
		System.out.println("The most frequent int is: " + mostFreqNumber);
	}
}
	