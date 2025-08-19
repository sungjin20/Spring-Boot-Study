package interfacetest;

public class ServiceMain {

	public static void main(String[] args) {
		CommonService service = null;
		if(args[0].equals("board")) {
			service = new BoardService();
		}
		else if(args[0].equals("member")) {
			service = new MemberService();
		}
		else if(args[0].equals("reservation")) {
			service = new ReservationService();
		}

		String result1 = service.getServiceName();
		String result2 = service.printServiceName(" 요청중");
		System.out.println(result1);
		System.out.println(result2);
	}

}
