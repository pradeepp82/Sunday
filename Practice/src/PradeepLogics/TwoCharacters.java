package PradeepLogics;

public class TwoCharacters {

	
	public static void main(String[] args) {
		int length=5;
		String str="abaacdabd";
		getString(str);
	}

	private static String getString(String str) {
		StringBuffer s = new StringBuffer(str);
		boolean flag=false;
		for (int i = 1; i < s.length(); i++) {
			int c,n=0,p;
			c=s.charAt(i);
			if (!(i>s.length()-2)) {
				n=s.charAt(i+1);
			}
			
			p=s.charAt(i-1);
			if ( c-p==1&&c-n==1) {
				String word = s.toString();
				int index = word.indexOf(s.charAt(i));
				while (index >= 0) {
				    System.out.println(index);
				    index = word.indexOf(s.charAt(i), index + 1);
				   // s.deleteCharAt(i);
					flag=true;
				}
				
			}
			
		}
		String  finalResult=null;
		if (s.length() > 0 && flag) {
			
			    finalResult=  getString(s.toString());
		}
		
		System.out.println(finalResult);
		return str;
		 
		
	}
}
