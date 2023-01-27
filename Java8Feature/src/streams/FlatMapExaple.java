package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExaple {
	public static void main(String args[]) {
		List<Integer> n1 = Arrays.asList(10,20,30);
		List<Integer> n2 = Arrays.asList(40,50,60);

		List<List<Integer>> bigList = Arrays.asList(n1,n2);
		System.out.println(bigList);
		
		List<Integer> flattenedList = bigList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(flattenedList);
	}
}
