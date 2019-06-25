package Array;

public class SwappingTwoNumbers {
	
	public static void main(String[] args) {
		int a=2,b=3;
		
		System.out.println("before Swap a:"+a +" b:"+b);
		a=a*b;//+
		b=a/b;//-
		a=a/b;//-
		System.out.println("after Swap a:"+a +" b:"+b);
	}

}
