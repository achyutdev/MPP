package problem2;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*To begin, create a final variable Stream<BigInteger> primes that contains all prime
numbers (in particular, the Stream is infinite).*/

class PrimeStream{

	public void printFirstNPrimes(int i) {
		final Stream<BigInteger> primes =Stream.iterate(BigInteger.ONE,n ->n.nextProbablePrime());
		List<BigInteger> primNum = primes.limit(i).collect(Collectors.toList());
		primNum.forEach(System.out::println);
	}

}

public class Problem2A {


	public static void main(String[] args) {

		PrimeStream ps = new PrimeStream();
		ps.printFirstNPrimes(2);
		System.out.println("--------------------------");
		ps.printFirstNPrimes(5);
		System.out.println("--------------------------");
		ps.printFirstNPrimes(6);
		System.out.println("--------------------------");


	}

}
