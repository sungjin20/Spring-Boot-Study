package di;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		coffeeMaker.setCoffeeMachine(new EspressoMachine());
		coffeeMaker.makeCoffee();
		
		coffeeMaker.setCoffeeMachine(new DripCoffeeMachine());
		coffeeMaker.makeCoffee();
		
		coffeeMaker.setCoffeeMachine(()->"또다른커피머신으로 커피를 만듭니다");
		coffeeMaker.makeCoffee();
	}

}
