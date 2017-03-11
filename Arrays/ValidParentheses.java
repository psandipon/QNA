
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
//


package ArrayManipulation;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses  {
	public static void main (String [] args) {
		
		String s = "[ok(okoko{k()o}kokokok)ok]" ;
		
		ValidParenthesesCode vpc = new ValidParenthesesCode () ;
		boolean b = vpc.isValid(s) ;
		System.out.println(b);
		
		 b = vpc.isValid2(s) ;
		System.out.println(b);
		
//		String operator = "({[";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println("this one => "+operator.contains(s.substring(i,i+1)));
//		}
		
	}
}




class ValidParenthesesCode {
public boolean isValid(String s) {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);
 
		if (map.keySet().contains(curr)) {
			stack.push(curr);
		} else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
			}
		}
	}
 
	return stack.empty();
}



public boolean isValid2(String s) {
	Stack<Character> stack = new Stack<Character>();
	String operator = "({[";
	String operator2 = ")}]";
	for (int i = 0; i < s.length(); i++) {
		if (operator.contains(s.substring(i, i + 1))) {
			int index = operator.indexOf(s.substring(i, i + 1));
			stack.push(operator2.charAt(index));
		} else if (stack.isEmpty())
			return false;
		else {
			char myChar = stack.pop();
			if (myChar != s.charAt(i))
				return false;
		}
	}
	if (!stack.empty())
		return false;
	return true;
}
}