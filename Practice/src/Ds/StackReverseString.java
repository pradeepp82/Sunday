package Ds;

//s

// Driver code 
class StackReverseString
{ 
	//function to reverse the string 
	public static void reverse(StringBuffer str) 
	{ 
		// Create a stack of capacity 
		// equal to length of string 
		int n = str.length(); 
		StackReverseString1 obj = new StackReverseString1(n); 
		
		// Push all characters of string 
		// to stack 
		int i; 
		for (i = 0; i < n; i++) {
		obj.push(str.charAt(i)); 
		}
		// Pop all characters of string 
		// and put them back to str 
		for (i = 0; i < n; i++) 
		{ 
			char ch = obj.pop(); 
			str.setCharAt(i,ch); 
		} 
	} 
	
	//driver function 
	public static void main(String args[]) 
	{ 
		//create a new string 
		StringBuffer s= new StringBuffer("GeeksQuiz"); 
		
		//call reverse method 
		reverse(s); 
		
		//print the reversed string 
		System.out.println("Reversed string is " + s); 
	} 
} 
