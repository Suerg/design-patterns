
public abstract class Duck {
	/**
	 *  	Declare two reference
	 *  variables for the behavior
	 *  interface types. All duck
	 *  subclasses inherit these.
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	
	public abstract void display();
	
	// Delegate to the behavior class
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
