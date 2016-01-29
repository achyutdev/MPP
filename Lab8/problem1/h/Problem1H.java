package problem1.h;

import java.util.function.Consumer;

public class Problem1H {
	public static void main(String...strings){
		Consumer<String> con =System.out::println;

//		Lambda expression
		Consumer<String> con1 = (str)->System.out.println(str);


		con.accept("Hello");
		con1.accept("World");
	}
}
