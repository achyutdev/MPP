package lab.problemB;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		super.flyBehave = new CannotFly();
		super.quackBehave = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("\tdisplaying");
	}
}
