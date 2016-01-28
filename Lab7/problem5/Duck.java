package problem5;

public abstract class Duck implements FlyBehavior,QuackBehavior{

	public void swim(){
		System.out.println("\tswimming");
	}

	abstract public void display();

}
