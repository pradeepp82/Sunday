package integer;

public class ReplaceInt {

	public static void main(String[] args) {
		System.out.println(convert0To5Rec(+523231));
	}

	static int convert0To5Rec(int num) {

		if (num == 0)
			return 0;

		int digit = num % 10;
		if (digit == 3)
			digit = 0;
		int p = convert0To5Rec(num / 10);
		return p * 10 + digit;
	}

}
