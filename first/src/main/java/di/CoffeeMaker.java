package di;

import org.springframework.stereotype.Component;


public class CoffeeMaker {
	CoffeeMachine coffeeMachine;
	public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	
	public void makeCoffee() {
		System.out.println(coffeeMachine.brew());
	}
}
