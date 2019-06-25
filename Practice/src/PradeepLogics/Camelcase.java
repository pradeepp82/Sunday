package PradeepLogics;

public class Camelcase {
	
	
	
	private static int camelcase(String s) {
		int count=1;
		for (int j = 1; j < s.length(); j++) {
			char ch=s.charAt(j);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		String s = "saveChangesInTheEditorPradeetPart";
		System.out.println(camelcase(s));
	}

	

}
