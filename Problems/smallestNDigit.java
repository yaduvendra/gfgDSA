import java.util.*;

class smallestNDigit { 

	// Function to return the smallest n digit 
	// number which is a multiple of 5 
	static long smallestMultiple(int n) 
	{ 
		if (n == 1) 
			return 5; 
		return (long)(Math.pow(10, n - 1)); 
	} 
 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt(); 
		System.out.println(smallestMultiple(n)); 
	} 
} 
