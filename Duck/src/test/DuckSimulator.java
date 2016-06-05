package test;

import model.Duck;
import model.FlyWithNoWings;
import model.FlyWithWings;
import model.MallardDuck;
import model.MuteQuack;
import model.Quack;
import model.RedheadDuck;
import model.RubberDuck;
import model.Squeak;

public class DuckSimulator {
	   public static void main(String[] args) {
		  System.out.print("��ͷѼ");
	      Duck mallard = new MallardDuck();
	      mallard.setQuackBehavior(new Squeak());
	      mallard.performQuack();
	      mallard.setFlyBehavior(new FlyWithWings());
	      mallard.performFly();
	     
	      
	      System.out.print("��ͷѼ");
	      Duck redhead=new RedheadDuck();
	      redhead.setQuackBehavior(new Quack());
	      redhead.performQuack();
	      redhead.setFlyBehavior(new FlyWithWings());
	      redhead.performFly();
	      
	      
	      System.out.print("С��Ѽ");
	      Duck rubber =new RubberDuck();
	      rubber.setQuackBehavior(new MuteQuack());
	      rubber.performQuack();
	      rubber.setFlyBehavior(new FlyWithNoWings());
	      rubber.performFly();
	      
	   }
	}
