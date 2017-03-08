//Que 01 :
//	Rotate an array of n elements to the right by k steps.
//
//	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//  How many different ways do you know to solve this problem?

package ArrayManipulation;

public class Rotate {

	public static void main(String[] args) {
		int [] n = {1,2,3,4,5,6} ;
		int k = 2 ;
		
		// you can put your demo code.
		
		printArr(n);
		
		
	}

	
	// This is done with Complexity of O(n) and space Complexity O(n)
	public static int [] rotate (int [] n ,  int k){
		
		int [] temp = new int [n.length] ;
		int c = 0 ;
		for (int i = k; i < temp.length; i++) {
			temp[i] = n [c++] ;
		}
		
		c=n.length-k;
		
		for (int i = 0; i < k; i++) {
			temp [i] = n[c++];
		}
		
		return temp ;
	}
	
	
//	// Now lets try to solve this same problem with space Complexity O(1)
	public static int [] rotate2 (int [] n ,  int k){
		
		//length of first part
		int temp = n.length - k; 
	 
		reverse(n, 0, temp-1);
		reverse(n, temp, n.length-1);
		reverse(n, 0, n.length-1);
		
		return n ;
	}
	
	public static int [] reverse (int [] n , int start , int end) {
		int temp = -1 ;
		int endCounter = end ;
		for (int i = start; i < end; i++) {
			temp = n [i] ;
			n [i] = n [endCounter] ;
			n [endCounter--] = temp ;
			if (i>=endCounter) break ;
			
			//printArr(n);
		}
		
		
		return n ;
	}
	
	private static void printArr(int[] rotate) {
		//System.out.println("---");
		System.out.print("[ ");
		for (int i : rotate) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
}
