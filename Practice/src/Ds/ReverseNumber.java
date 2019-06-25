package Ds;

public class ReverseNumber {
	
	public static void main(String[] args)  {  
	    int a;
	    int b=0;  
	    int n=153; 
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10; 
	    b=b*10+a;
	    }  
	    System.out.println(b);
	}

}
