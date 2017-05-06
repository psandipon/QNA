package ArrayManipulation;

public class ShortestPalindrome {
	public static void main(String[] args) {

		String s1 = "aacecaaa";
		String s2 = "acfacd";
		System.out.println(shortestPalindromeAlgo(s2)) ;

	}

	public static String shortestPalindromeAlgo(String s) {
		int i=0;
		int j=s.length()-1;

		while(j>=0){
			if(s.charAt(i)==s.charAt(j)){
				i++;
			}
			j--;
		}

		if(i==s.length())
			return s;

		String suffix = s.substring(i);
		String prefix = new StringBuilder(suffix).reverse().toString();
		String sendAgain = s.substring(0, i);
		System.out.println(sendAgain+"<->"+suffix);
		String mid = shortestPalindromeAlgo(sendAgain);
		return prefix+mid+suffix;
	}


}
