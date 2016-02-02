/**
 *
 */
package problem1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Achyut Dev
 *
 */

// this is useful to detect error and mistakes while programming

public class LastCharUpperTest {

	@Test
	public void test() {
		List<String> OriginalWords = Arrays.asList("Achyut", "Amit", "Siken", "Sagar", "Limbu", "Jacky");
		List<String> finalWords = Arrays.asList("AchyuT", "AmiT", "SikeN", "SagaR", "LimbU", "JackY");

		List<String> result=TDDPractice.changeLastCharToUpper(OriginalWords);
		assertEquals(finalWords, result);
	}

}
