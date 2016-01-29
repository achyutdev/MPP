package problem1.g;

import java.util.function.Function;

public class MyClass {


	public boolean equals(MyClass mm){
		return this.equals(mm);
	}



}

class Main{
	public static void main(String[] args) {
		MyClass myclass = new MyClass();

		Function<MyClass, Boolean> func = new Function<MyClass, Boolean>() {

			@Override
			public Boolean apply(MyClass t) {
				return true;
			}
		};

//		Confusion
//		need time to solve


	}

}
