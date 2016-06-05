package model;

public class RubberDuck extends Duck {
	public RubberDuck() {
	      quackBehavior = new  MuteQuack();
	      flyBehavior = new FlyWithNoWings();
	   }
	   public void display() {}
}
