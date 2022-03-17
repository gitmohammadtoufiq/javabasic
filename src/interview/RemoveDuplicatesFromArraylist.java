package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,3));
		LinkedHashSet<Integer> nums=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> sortedList=new ArrayList<Integer>(nums);
		System.out.println(sortedList);
		
		ArrayList<Integer> list=(ArrayList<Integer>) numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
