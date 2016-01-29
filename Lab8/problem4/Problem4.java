package problem4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Problem4 {

//	Good solution
	public static int countWords(List<String> words, char c, char d, int len){

		return (int) words.stream()

					.filter(word ->word.length()>len)

					.filter(word ->word.indexOf(c)>=0)

					.filter(word ->word.indexOf(d)<0)

					.count();


	}

//	better solution

	final static Function<Integer, Predicate<String>> lengthPre = len ->word ->word.length()>len;
	final static Function<Character, Predicate<String>> includeCharPre = c ->word ->word.indexOf(c)>=0;
	final static Function<Character, Predicate<String>> excludeCharPre = d-> word ->word.indexOf(d)<0);




	public static void main(String...strings){

		String[] words ={"achyut", "devkota","amit", "sagar","siken","tabrez"};

		List<String> list = Arrays.asList(words);

		int count = countWords(list,'a','r',3);

		System.out.println("Good solution count :  "+count);


//		better implementation

		int count1 = (int) list.stream().filter(lengthPre.apply(3))
					.filter(includeCharPre.apply('a'))
					.filter(excludeCharPre.apply('r'))
					.count();

		System.out.println("Better solution count: "+ count1);

	}

}
