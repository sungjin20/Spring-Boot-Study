package di_spring;

import org.springframework.stereotype.Component;

@Component
public class EspressoMachine implements CoffeeMachine{
	
	public EspressoMachine() {
		// TODO Auto-generated constructor stub
		System.out.println("EspressoMachine");
	}

	public String brew() {
		return "에스프레소 머신으로 커피 추출합니다";
	}

}
