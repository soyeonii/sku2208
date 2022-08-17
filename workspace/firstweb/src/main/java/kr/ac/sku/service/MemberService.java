package kr.ac.sku.service;

import java.util.List;

import kr.ac.sku.dao.MemberDAO;
import kr.ac.sku.dto.MemberDTO;

public class MemberService {
	MemberDAO dao = new MemberDAO();

	// 회원 가입
	public void joinMember(MemberDTO member) {
		// 회원 가입을 위해서 체크하거나 필요한 비지니스가 있다면 여기서 구현!!
		// 회원 가입 조건에 충족하면 DB에 저장하도록 dao를 이용한다.
		if (dao.addMember(member))
			System.out.println("DB에 저장 성공");
		else
			System.out.println("DB에 저장 실패");
	}

	// 회원 목록
	public List<MemberDTO> getMemberList() {
		return dao.getMembers();
	}

	// 회원 삭제
	public void deleteMember(String id) {
		if (dao.deleteMember(id))
			System.out.println("DB 삭제 성공");
		else
			System.out.println("DB 삭제 실패");
	}

	// 회원 정보 조회
	public MemberDTO getMember(String id) {
		return dao.getMember(id);
	}

	// 회원 정보 수정
	public void updateMember(MemberDTO member) {
		if (dao.updateMember(member))
			System.out.println("DB 수정 성공");
		else
			System.out.println("DB 수정 실패");
	}
}
