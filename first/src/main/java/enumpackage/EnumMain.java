package enumpackage;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = Day.MONDAY;
		System.out.println(day1.name());
		System.out.println(day1.valueOf("MONDAY"));
		System.out.println(day1.ordinal());
		
		System.out.println(Day2.FRIDAY.label());
		System.out.println(Day2.FRIDAY.name());
	}

}

/*
enum Role {
	ADMIN("관리자"),
	USER("일반회원"),
	NONUSER("비회원");
}
*/