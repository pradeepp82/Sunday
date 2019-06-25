import java.util.*;

public class ListExample {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		al.add("apple");
		al.add("orange");
		al.add("mango");
		al.add("banana");
		al.add("orange");
		al.add("banana");
		al.add("cherry");
		al.add("Vijay");
		al.add("apple");
		al.add("apple");
		for (String s : al) {

			if (hm.containsKey(s)) {
				char last = (s.charAt((s.length() - 1)));
				String value = getNextValue(last);
				s = s+value;
				hm.put(s, s);
			} else {
				hm.put(s, s);
			}

		}
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getValue());
		}

	}

	static String getNextValue(char jj) {
		String s = String.valueOf(jj);
		if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6")
				|| s.equals("7") || s.equals("8") || s.equals("9")) {
			int[] intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int result = Integer.parseInt(s);
			System.out.println("repeated value" + result);
		} else {
			s = "1";
		}

		return s;
	}
}