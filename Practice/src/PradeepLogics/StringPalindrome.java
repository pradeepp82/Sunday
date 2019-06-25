package PradeepLogics;

import java.util.function.Predicate;

class StringPalindrome {
	public static void main(String args[]) {
		String input = "abdfhdyrbdbsdfghjkllkjhgfds";
		if (checkPalindrome(input)) {
			System.out.println(input.length());
		} else {
			if (input.length() % 2 != 0) {
				System.out.println(input.length() + (input.length() - 1));
			} else {

				if (checkPalindrome(input.substring(0, input.length())) || checkPalindrome(input.substring(1))) {
					System.out.println(input.length() + 1);
				} else {
					System.out.println(input.length() + (input.length() - 1));
				}
			}
		}
	}

	private static boolean checkPalindrome(String input) {
		int length = input.length();

		String reverseValue = "";
		for (int i = length - 1; i >= 0; i--) {
			reverseValue = reverseValue + input.charAt(i);
		}
		Predicate<String> result = p -> p.equals(input);
		// System.out.println(result.test(reverseValue));
		return result.test(reverseValue);
	}
}