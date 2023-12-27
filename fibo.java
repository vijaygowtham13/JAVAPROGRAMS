

class GFG { 

	// Function to print the fibonacci series 
	 int fib(int n) 
	{ 
		
		if (n <= 1) 
			return n; 

		// Recursive call 
		return fib(n - 1) + fib(n - 2); 
	}
} 

class fibo{	

	public static void main(String args[]) 
	{ 
	    GFG obj = new GFG();
	 
		int N = 10; 

	 
		for (int i = 0; i < N; i++) { 

			System.out.print(obj.fib(i) + " "); 
		} 
	} 
}
