class Fibonacci{
	
	public static int fib(int n){
		if(n < 2 ){ return 1; }
		int f=0 , s = 1;
		for(i = 2 ; i < n ; i++){
			t = f + s;
			
			t = s;
			s = f;  
		}
		return s;
		 
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.print(fib(sc.nextInt()));

	}
}