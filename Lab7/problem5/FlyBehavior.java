package problem5;

public interface FlyBehavior {
	default void fly(){
		System.out.println("\tfly with wings");
	}
}
