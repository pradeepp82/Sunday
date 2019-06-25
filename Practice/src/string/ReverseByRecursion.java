package string;

public class ReverseByRecursion {
	
	private static String recursiveMethod(String input) {
		 if (null==input || (input.length()<=1)) {
			return input;
		}
		return recursiveMethod(input.substring(1))+input.charAt(0);
	}
	
	public static void main(String[] args) {
		String input= "RAJARAM";
		
		System.out.println(recursiveMethod(input));
	}

	

}
