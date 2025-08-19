package interfacetest;

public interface CalcInterface {
	int add(int i, int j);
}

class Calc implements CalcInterface{
	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}