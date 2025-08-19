package di_spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DripCoffeeMachine implements CoffeeMachine{

	public DripCoffeeMachine() {
		// TODO Auto-generated constructor stub
		System.out.println("DripCoffeeMachine객체생성");
	}
	@Override
	public String brew() {
		return "드립커피를 만들어드립니다.";
	}
	
}
