//Qna 02:
//	Given an input string, reverse the string word by word.
//
//	For example, given s = "the sky is blue", return "blue is sky the".

package ArrayManipulation;



public class ReverseWords {

	public static void main(String[] args) {

		String s = "the sky is blue";

		Solution solution = new Solution();
		s = solution.reverseWords(s);
		System.out.println(s);

	}

}

class Solution {
	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		// split to words by space
		
		String [] stringArray =  s.split(" ");
		int left = 0 ;
		int right = stringArray.length-1 ;
		String temp = "" ;
		while (left < right) {
			
			temp = stringArray [left];
			stringArray[left] = stringArray[right];
			stringArray[right]=temp ;
			left++ ;
			right -- ;
			if (left>right) break ;
			
		}
		
		temp ="";
		for (String string : stringArray) {
			temp = temp + string+" " ;
		}
		
		return temp ;
	}
}