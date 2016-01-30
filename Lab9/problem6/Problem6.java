/**
 *
 */
package problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sql.rowset.Joinable;

/**
 * @author Achyut Dev
 *
 */
/*
Implement a method
public Set<String> union(List<Set<String>> sets)
by creating a stream pipeline that transforms a list of sets (of type String) into the union of those
sets. Make use of the reduce method for streams.
Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}] to the set
{“A”, “B”, “D”, “1”, “3”, “5”}.
*/


public class Problem6 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>(Arrays.asList("A", "B"));
		Set<String> set2 = new HashSet<String>(Arrays.asList("D"));
		Set<String> set3 = new HashSet<String>(Arrays.asList("1","3","5"));


		List<Set<String>> aa = new ArrayList<>();
		aa.add(set1);
		aa.add(set2);
		aa.add(set3);


		System.out.println(union(aa));

	}
	public static Set<String> union(List<Set<String>> sets){
		return null;
//		return sets.stream().flatMap(mapper);

	}

}
