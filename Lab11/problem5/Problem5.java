package problem5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,7,23,0);
		List<String> strList = Arrays.asList("Achyut","Devkota", "Siken","Sagar","Amit");

		List<LocalDate> dateList = new ArrayList<LocalDate>();
		dateList.add(LocalDate.of(2016, 1, 30));
		dateList.add(LocalDate.of(2016, 2, 3));
		dateList.add(LocalDate.of(2016, 3, 12));


		System.out.println("Second Integer:" + secondSmallest(intList));
		System.out.println("Second String:" + secondSmallest(strList));
		System.out.println("Second Date:" + secondSmallest(dateList));

	}


	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

		return list.stream().sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList()).get(1);

	}

}
