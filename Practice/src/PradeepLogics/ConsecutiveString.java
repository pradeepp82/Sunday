package PradeepLogics;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveString {

	public static void main(String[] args) {

		String s = "abbcabc";
		findString(s);
	}

	private static void findString(String str) {
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		String sp = sb.toString();
		char[] CharArray = sp.toCharArray();
		int length = sb.length();
		List<String> result = getResult(str, sb, CharArray, length);
		if (result.isEmpty() && length < str.length()) {
			length = length + 1;
			result = getResult(str, sb, CharArray, length);
		}
		if (result.isEmpty()) {
			System.out.println("no String Present");
		} else {

			String length1 = result.stream().min((p1, p2) -> p1.length() < p2.length() ? 1 : -1).get();
			System.out.println("Sortest length :" + length1.length());

		}
	}

	private static ArrayList<String> getResult(String str, StringBuilder sb, char[] CharArray, int length) {
		ArrayList<String> result = new ArrayList<>();
		String mainstr = str;
		int count = 0;
		while (str.length() >= length) {
			String s1 = str.substring(0, length);
			boolean fin = true;
			for (int i = 0; i < CharArray.length; i++) {
				boolean ispresent = (s1.contains(String.valueOf(CharArray[i])) ? true : false);
				fin = fin & ispresent;

			}
			if (fin) {
				result.add(s1);
			}

			str = str.substring(length);

		}
		if (result.isEmpty() && str.length() > 1) {
			count++;
			str = mainstr.substring(count);
			result = getResult(str, sb, CharArray, length);
		}
		return result;
	}

}
