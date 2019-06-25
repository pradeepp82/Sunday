package Array;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
	
		int a[] = {1,2,4,5,6,7}; 
        int miss = getMissingNo(a,6); 
        System.out.println(miss); 
		 
	}

	static int getMissingNo (int a[], int n) 
    { 
        int i, total; 
        total  = (n+1)*(n+2)/2;    
        for ( i = 0; i< n; i++) 
           total -= a[i]; 
        return total; 
    } 

	 

}
