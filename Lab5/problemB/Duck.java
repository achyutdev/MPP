package lab.problemB;

public abstract class Duck{
	public FlyBehavior flyBehave;
	public QuackBehavior quackBehave;
	
	public void fly(){
		flyBehave.fly();
	}
	public void quack(){
		quackBehave.quack();
	}
	
	public void swim(){
		System.out.println("\tswimming");
	}
	
	abstract public void display();

}
