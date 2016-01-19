package lab.problemB;

public class MallardDuck extends Duck {
	
	public  MallardDuck() {
		super.flyBehave=new FlyWithWings();
		super.quackBehave=new Quack();
	}
	
	@Override
	public void display(){
		System.out.println("\tdisplay");
	}
	
}
