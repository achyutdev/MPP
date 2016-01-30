package problem4;

import java.util.stream.IntStream;

/*Implement a method
public static void printSquares(int num)
which creates an IntStream using the iterate method. The method prints to the console the
first num squares. For instance, if num = 4, then your method would output 1, 4, 9, 16. Note:
You will need to come up with a function to be used in the second argument of iterate.*/

public class Problem4 {

	public static void main(String[] args) {
		printSquares(4);
	}
	public static void printSquares(int num){
		 IntStream.iterate(1,n -> n+1)
		 		.limit(num)
		 		.forEach(x->System.out.println(x*x));
	}

}
