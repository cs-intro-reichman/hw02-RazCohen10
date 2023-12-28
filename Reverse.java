/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String StringIn = args[0];
		String StringOut = "";
		for (int i = StringIn.length() - 1; i >= 0 ; i--)
		{
			StringOut += StringIn.charAt(i);
		}
		System.out.println(StringOut);
		System.out.println(StringOut.charAt(StringOut.length() / 2));
	}
}
