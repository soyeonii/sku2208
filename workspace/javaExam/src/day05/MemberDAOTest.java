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
//		if (dao.addMember(member))
//			System.out.println("^_^");
//		else
//			System.out.println("-_-");
		
		for (MemberDTO m : dao.getMembers()) {
			System.out.println(m);
		}
	}
}
