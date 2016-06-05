package model;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
	      quackBehavior = new  Squeak();
	      flyBehavior = new FlyWithRocket();
	   }
	   public void display() {}

}
