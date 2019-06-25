package PradeepLogics;

import java.io.IOException;

public class ReducedDuplicateString {

	// Complete the superReducedString function below.
	static String superReducedString(String s1) {
		StringBuffer s = new StringBuffer(s1);
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {

			int j = i + 1;
			if (!(j > s.length() - 1)) {

				if (s.charAt(i) == s.charAt(j)) {
					flag = true;
					s = s.deleteCharAt(i + 1);
					s = s.deleteCharAt(i);
					i--;
				}
			}

		}
		String  finalResult="EMPTY STRING";
		if (s.length() > 0 && flag) {
			
			   finalResult=  superReducedString(s.toString());
		}
		
		
		return finalResult.toString();
	}

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = bufferedReader.readLine();
		 */

		String result = superReducedString("baab");
		System.out.println(result);

		/*
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
	}
}
