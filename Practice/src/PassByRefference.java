import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PassByRefference {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(45);
		addExternally(list);
		
		ListIterator<Integer> 
        iterator = list.listIterator(); 
		while(iterator.hasNext()) {
			
			System.out.println("Value is : "
                    + iterator.next()); 
		}
	}

	private static void addExternally(List<Integer> list) {
		 list.add(11);
		 list.add(12);
		
	}

}
