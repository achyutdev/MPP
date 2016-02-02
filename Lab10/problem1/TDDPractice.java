package problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Achyut Dev
 *
 */
public class TDDPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Achyut", "Amit", "Siken", "Sagar", "Limbu", "Jacky");
		changeLastCharToUpper(words).forEach(System.out::println);
	}

	static List<String> changeLastCharToUpper(List<String> words) {
		return words.stream()
				.map(x->x.substring(0,x.length()-1)+x.substring(x.length()-1).toUpperCase())
				.collect(Collectors.toList());

	}

}
