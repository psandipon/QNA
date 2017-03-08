//Qna 03:
//	Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.
//
//	For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.

//Check if two given strings are isomorphic to each other
//Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to same character in ‘str2’
//
//Examples:
//
//Input:  str1 = "aab", str2 = "xxy"
//Output: True
//'a' is mapped to 'x' and 'b' is mapped to 'y'.
//
//Input:  str1 = "aab", str2 = "xyz"
//Output: False
//One occurrence of 'a' in str1 has 'x' in str2 and 
//other occurrence of 'a' has 'y'.

package ArrayManipulation;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
			
		String s = "egg" ;
		String t = "add" ;
		isomorphicStringsCode ok = new isomorphicStringsCode() ;
		System.out.println(ok.ifIsomorphicStrings(s, t) );
		
	}

}

class isomorphicStringsCode {

	public boolean ifIsomorphicStrings(String s, String t) {

		HashMap<Character, Character> map = new HashMap<>();

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		if (sArray.length != tArray.length)
			return false;

		for (int i = 0; i < s.length(); i++) {  // O(n) time complexity

			if (map.containsKey(sArray[i])) {
				if (map.get(sArray[i]) != tArray[i]) {
					return false;
				}
			} else {
				if (map.containsValue(tArray[i])) {
					if (map.get(sArray[i]) != tArray[i]) {
						return false;
					}
				}
				
				map.put(sArray[i], tArray[i]);
			}
		}

		return true;
	}

	
	
	public boolean ifIsomorphicStrings2(String s, String t) {
		
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
	
		
		if (sArray.length != tArray.length)
			return false;
		
		int len = sArray.length ;
		char[] Temp = new char [len*2] ;
		
		
		for (int i = 0; i < tArray.length; i++) {
			
//			if (){
//				// Here check if key is in it from sArray comparing with Temp
//			}
//			else {
//				// Here check if value is in it from tArray comparing with Temp
//			}
//			
			
			// This is my madeUp put method 
			Temp[i] = sArray[i] ;
			Temp[i+len] = tArray[i] ;

			
		}
		
		System.out.println("It is in a pseudo format");
		
		return true ;
	}
	
	
	
	
}