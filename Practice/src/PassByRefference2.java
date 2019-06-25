
public class PassByRefference2 {
	
	public static void main(String[] args) {
		String s= new String("pradeep");
		String p= new String("panwar");
		
		swap(s,p);
		System.out.println("outSide swap "+s);
		System.out.println("outSide swap "+p);
		
	}

	private static void swap(String s, String p) {
		String r= null;
		r=s;
		s=p;
		p=r;
		System.out.println("Inside swap "+s);
		System.out.println("Inside swap "+p);
		
	}

}
