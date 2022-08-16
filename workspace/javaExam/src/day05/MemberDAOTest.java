package day05;

public class MemberDAOTest {
	public static void main(String[] args) {
//		MemberDTO member = new MemberDTO();
//		member.setId("admin");
//		member.setPassword("1234");
//		member.setName("관리자");
//		member.setEmail("admin@admin.com");
//		
		MemberDAO dao = new MemberDAO();
		// 삽입
//		if (dao.addMember(member))
//			System.out.println("^_^");
//		else
//			System.out.println("-_-");
		
		// 전체 조회
		for (MemberDTO m : dao.getMembers()) {
			System.out.println(m);
		}
		
		// 조회
		MemberDTO member = dao.getMember("sku");
		System.out.println(member);
		
		//수정
		member.setPassword("sku1234");
		if (dao.updateMember(member))
			System.out.println("^_^");
		else
			System.out.println("-_-");
		System.out.println(member);
	}
}
