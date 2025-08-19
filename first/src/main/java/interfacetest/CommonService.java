package interfacetest;

public interface CommonService {
	String name = "sds";
	String getServiceName();
	String printServiceName(String name);
}

class MemberService implements CommonService{

	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "MemberService";
	}

	@Override
	public String printServiceName(String name) {
		// TODO Auto-generated method stub
		return "[MEMBERSERVICE] 회원 서비스 " + name;
	}
	
}

class BoardService implements CommonService{
	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "BoardService";
	}

	@Override
	public String printServiceName(String name) {
		// TODO Auto-generated method stub
		return "[BOARDSERVICE] 게시판 서비스 " + name;
	}
}

class ReservationService implements CommonService{
	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "ReservationService";
	}

	@Override
	public String printServiceName(String name) {
		// TODO Auto-generated method stub
		return "[RESERVATIONSERVICE] 게스트하우스 예약 서비스 " + name;
	}
}