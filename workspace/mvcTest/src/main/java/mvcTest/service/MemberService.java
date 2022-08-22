package mvcTest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcTest.dao.MemberRepository;
import mvcTest.model.Member;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Member> getMembers() {
		return memberRepository.findAll();
	}
	
	public void addMember(Member member) {
		memberRepository.save(member);
	}
}
