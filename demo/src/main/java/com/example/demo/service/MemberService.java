package com.example.demo.service;

import com.example.demo.dao.MemberRepository;
import com.example.demo.dto.Member;
import com.example.demo.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;
    private final MemberRepository memberRepository;

    @Transactional  // 기본값이 readOnly = false
    public Member addMember(Member member) {
        MemberEntity memberEntity = memberMapper.fromMember(member);
        memberEntity = memberRepository.save(memberEntity); // id, joinDate 등 저장되면서 생성된 내용이 리턴
        return memberMapper.fromMemberEntity(memberEntity);
    }

    @Transactional(readOnly = true) // 조회만 있을 때
    public List<Member> getMembers() {
        List<MemberEntity> members = memberRepository.findAll();
        return memberMapper.fromMemberEntityList(members);
    }
}
