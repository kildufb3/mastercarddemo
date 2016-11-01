public class StringReverseRecursively {
	//Reverse a string recursively
	public static String reverseRecursively(String userString)
	{
		//Base case
		if(userString.length() <= 1)
		{
			//Returns the new beginning of the reversed string 
			return userString ;
		}
		else
		{
			//Recalls the function without the first char while adding the first char to the end of the string
			return reverseRecursively(userString.substring(1)) + userString.charAt(0);
		}
	}
}