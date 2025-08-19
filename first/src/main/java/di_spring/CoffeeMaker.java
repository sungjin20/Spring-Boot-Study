package di_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CoffeeMaker {
	@Autowired
	CoffeeMachine coffeeMachine;
	
	public CoffeeMaker() {
		// TODO Auto-generated constructor stub
		System.out.println("CoffeeMaker");
	}
	
	@PostConstruct
	public void makeCoffee() {
		System.out.println(coffeeMachine.brew());
	}
}
