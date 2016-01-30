package problem1;

/*You have a Stream of Strings called stringStream consisting of the values �Bill�,
�Thomas�, and �Mary�. Write the one line of code necessary to print this stream to the
console so that the output looks like this:
Bill, Thomas, Mary
*/

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1b {
	public static void main(String...strings){
		Stream<String> stringStream =Arrays.asList("Bill", "Thomas", "Mary").stream();
		System.out.println(stringStream.collect(Collectors.joining(", ")));
	}
}
