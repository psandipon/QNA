//Given two binary strings, return their sum (also a binary string).
//
//For example, a = "11", b = "1", the return is "100".




package ArrayManipulation;


import java.math.BigInteger;

public class AddBinary {


	public static void main(String[] args) {
		
		String a = "11", b = "1";
		addBinaryCode addB  =  new addBinaryCode() ;
		System.out.println(addB.addBinary(a, b) );
		
	}
	
	
}

class addBinaryCode {
	String addBinary(String a, String b) {
	    return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
	}
}