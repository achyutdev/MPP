package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThis {



//	method 1 - handle exception within stream pipeline
	List<String> processList(List<String> list)  {

	    return list.stream()
	    		   .map(x -> {
	    			   try {
	    				   return doNothingIfShort(x);
					} catch (Exception e) {
							return e.getMessage();
					}
	    		   })
	               .collect(Collectors.toList());

	}

//	method 2 - using companion class

	List<String> processList1(List<String> list)  {

	    return list.stream()
	    		   .map(x -> companionMethod(x))
	               .collect(Collectors.toList());

	}

	public String companionMethod(String x) {
		try {
			return doNothingIfShort(x);
		} catch(InputTooLongException e) {
			throw new RuntimeException(e);
		}
	}


	String doNothingIfShort(String input) throws InputTooLongException {
	    if (input.length() > 3) throw new InputTooLongException();
	    else return input;
	}

	public static void main(String[] args) {
		FixThis ft = new FixThis();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		System.out.println(ft.processList(words1));
		System.out.println(ft.processList1(words1));
	}

	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}
