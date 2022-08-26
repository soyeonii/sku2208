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
	
	public Member getMember(String id) {
		return memberRepository.findById(id).orElseThrow();
	}
	
	public List<Member> getMembers() {
		return memberRepository.findAll();
	}
	
	@Transactional
	public void addMember(Member member) {
		memberRepository.save(member);
	}
	
	@Transactional
	public void updateMember(Member member) {
		Member findMember = memberRepository.getOne(member.getId());
		findMember.setEmail(member.getEmail());
		findMember.setName(member.getName());
		findMember.setPassword(member.getPassword());
		memberRepository.save(findMember);
	}
	
	@Transactional
	public void deleteMember(String id) {
		memberRepository.deleteById(id);
	}
}
