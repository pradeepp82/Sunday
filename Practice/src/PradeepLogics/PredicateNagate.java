package PradeepLogics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNagate {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,3,6,5,4,7,8);
		Predicate<Integer> even = p -> p%2==0;
		Predicate<Integer> odd =even.negate();
		
		List<Integer> evenlist=list.stream().filter(even).collect(Collectors.toList());
		/*List<Integer> oddlist=*/list.stream().filter(odd).forEach(System.out::println);//collect(Collectors.toList());
		
		System.out.println(evenlist);
		//System.out.println(oddlist);
	}
	

}
