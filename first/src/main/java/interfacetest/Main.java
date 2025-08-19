package interfacetest;

public class Main {
	public static void main(String[] args) {
		CalcInterface c = (i, j)->i+j;
		System.out.println(c.add(10, 20));
	}
}
