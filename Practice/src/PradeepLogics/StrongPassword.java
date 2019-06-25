package PradeepLogics;

public class StrongPassword {

	static int minimumNumber(int n, String password) {

		n = getStrongPassword(password);
		System.out.println(n);

		return n;

	}

	private static int getStrongPassword(String str) {
		char ch;
		boolean digit = false;
		boolean upper = false;
		boolean lower = false;
		boolean special = false;
		int d = 1, u = 1, l = 1, s = 1, result = 0;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digit = true;
				d = 0;
			} else if (Character.isUpperCase(ch)) {
				upper = true;
				u = 0;
			} else if (Character.isLowerCase(ch)) {
				lower = true;
				l = 0;
			} else if (str.contains("!") || str.contains("@") || str.contains("#") || str.contains("$")
					|| str.contains("%") || str.contains("^") || str.contains("&") || str.contains("*")
					|| str.contains("(") || str.contains(")") || str.contains("-") || str.contains("+")) {
				special = true;
				s = 0;
			}

		}
		if (digit & special & lower & upper & str.length() >= 6) {
			return result;
		} else if (!(digit & special & lower & upper)) {
			if (str.length() < 6) {
				int expacted = 6 - str.length();
				result = ((str.length() + d + l + u + s) >= 6 ? d + s + u + l : expacted);

			} else {
				result = d + s + u + l;
			}

			return result;
		} else {
			result = 6 - str.length();
			return result;
		}

	}

	public static void main(String[] args) {
		int i = 5;
		String s = "01235";
		minimumNumber(i, s);
	}

}
