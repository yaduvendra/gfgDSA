import java.util.*;

class CountingValleys{

	
	public static void main(String[] args) {
	String s = "DDUDDDUUDU";
	Character c = null;
	int v = 0;
	Stack<Character> stack = new Stack<Character>();
			
			for (int i=0; i<10; i++) {
			 	
			c = s.charAt(i);
			if(stack.empty()){
				if(c == 'D'){

					stack.push(c); 
					v++;
				}


				else if(c == 'U') {}	
			}
			stack.push(c);  

			    
			//stack.pop();
			 } 

			Iterator<Character> itr=stack.iterator();  

			while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}
}