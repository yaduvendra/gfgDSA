// Java code for adding elements in Set 
import java.util.*; 
public class setExample 
{ 
	public static void main(String[] args) 
	{ 
		// Set deonstration using HashSet 
		Set<String> hash_Set = new HashSet<String>(); 
		hash_Set.add("Example1"); 
		hash_Set.add("Example2"); 
		hash_Set.add("Example2"); //Check for set
		hash_Set.add("Example2"); //Check for set 
		hash_Set.add("Example"); 
		hash_Set.add("Set"); 
		System.out.print("Set output without the duplicates"); 

		System.out.println(hash_Set); 

		// Set deonstration using TreeSet 
		System.out.print("Sorted Set after passing into TreeSet"); 
		Set<String> tree_Set = new TreeSet<String>(hash_Set); 
		System.out.println(tree_Set); 
	} 
} 
