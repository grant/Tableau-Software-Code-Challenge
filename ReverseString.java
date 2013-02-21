/*
  Contains a method recursively reverse a string
*/
public class ReverseString {

	// Gets a reversed string
	public static String reverse(String s) {
		return (s.length() <= 1) ? s : reverse(s.substring(1, s.length())) + s.charAt(0);
	}
}