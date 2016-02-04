package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Capture {

	public static void main(String[] args) {
		List<String> strLst = Arrays.asList("A", "B", "C", "D");
		reverse(strLst);

	}

	public static void reverse(List<?> list) {
		reverseHelper(list);
	}

	private static <T> void reverseHelper(List<T> list) {
		Collections.reverse(list);
		list.forEach(action);
//		List<T> revList=new ArrayList<T>();
//		for (int j = list.size() - 1; j >= 0; j--) {
//			revList.add(list.get(j));
//		}
//
//		revList.forEach(System.out::println);
	}

}
