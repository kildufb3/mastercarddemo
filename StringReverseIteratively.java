public class StringReverseIteratively {
    //Function that reads in a string and the reverses it using iterations
	public static String reverseString(String userString)
	{
		if(userString == null)
		{
			return "Null String";
		}
		else
		{
			//Convert the to an array of Chars
			char[] characterArray = userString.toCharArray(); 
			//Start and end indexes to help swap the chars
			int startIndex = 0;
			int endIndex = userString.length() - 1;
			//To be used as a temporary hold of chars
			char tmp;
			//While loop to move through the char array
			while(startIndex <= endIndex)
			{
				//temporarily holds the value at startIndex
				tmp = characterArray[startIndex];
				//Value at StartIndex becomes value at EndIndex 
				characterArray[startIndex] = characterArray[endIndex];
				//Value at EndIndex becomes the old value at startIndex stored in tmp
				characterArray[endIndex] = tmp;
				//Move to the next indexes
				startIndex++;
				endIndex--;
			}
			//Return the reversed character as a String 
			return new String(characterArray);
		}
	}
}