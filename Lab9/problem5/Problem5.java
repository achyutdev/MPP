package problem5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Achyut Dev
 *
 */

/*Create a method
Stream<String> streamSection(Stream<String> stream, int m, int n)
which extracts a substream from the input stream stream consisting of all elements from
position m to position n, inclusive; you must use only Stream operations to do this. You can
assume 0 <= m <= n. A Java class has been provided for you in the lab folder for this lesson;
implement the method streamSection given in that class, and test using the main method
provided.*/


public class Problem5 {

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n);
	}

	public static void main(String[] args) {
		System.out.println(streamSection(nextStream(), 0, 3).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 2, 5).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 7, 8).collect(Collectors.joining(", ")));
	}

	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}

