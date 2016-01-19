package lab.problemB;

public class RubberDuck extends Duck {
	
	public  RubberDuck() {
		super.flyBehave=new CannotFly();
		super.quackBehave=new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("\tdisplaying");
	}
}
