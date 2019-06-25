public class PassByRefference1 {

	
	public static void main(String[] args) {
		Balloon red = new Balloon("red");
		Balloon blue = new Balloon("blue");
		swap(red, blue);
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		
		foo(blue);
		System.out.println("blue color="+blue.getColor());
		
	}

	private static void foo(Balloon blue) {
		 blue.setColor("red");
		 blue = new Balloon("Green");  
		 blue.setColor("Blue");  
		
		
	}

	private static void swap(Balloon red, Balloon blue) {
		 Object tmp =red;
		 red=blue;
		 blue=(Balloon) tmp;
		
	}
}
