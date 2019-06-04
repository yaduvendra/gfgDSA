import java.util.*;

class CountingValleys{

	
	public static void main(String[] args) {
	String s = "DDUDDDUUDU";
	Character c = null;
	Stack<Character> stack = new Stack<Character>();
			for (int i=0; i<10; i++) {
			//System.out.println(s); 	
			c = s.charAt(i);

			stack.push(c);  

			//stack.push("U");    
			//stack.pop();
			 } 

			Iterator<Character> itr=stack.iterator();  

			while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}
}