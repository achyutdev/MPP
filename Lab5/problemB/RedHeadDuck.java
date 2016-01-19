package lab.problemB;

public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		super.flyBehave =new FlyWithWings();
		super.quackBehave= new Quack();
	}
	@Override
	public void display(){
		System.out.println("\tdisplaying");
	}
}
