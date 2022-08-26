package com.example.demo.service;

import com.example.demo.dto.Member;
import com.example.demo.entity.MemberEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberMapper {
    public Member fromMemberEntity(MemberEntity memberEntity) {
        Member member = new Member(memberEntity.getUserId(), memberEntity.getName(), memberEntity.getPassword(), memberEntity.getEmail());
        member.setId(memberEntity.getId());
        member.setJoinDate(memberEntity.getJoinDate());
        return member;
    }

    public MemberEntity fromMember(Member member) {
        MemberEntity memberEntity = new MemberEntity(member.getUserId(), member.getName(), member.getPassword(), member.getEmail());
        memberEntity.setId(member.getId());
        memberEntity.setJoinDate(memberEntity.getJoinDate());
        return memberEntity;
    }

    public List<Member> fromMemberEntityList(List<MemberEntity> memberEntityList) {
        List<Member> list = new ArrayList<>();
        for (MemberEntity memberEntity : memberEntityList) {
            list.add(fromMemberEntity(memberEntity));
        }
        return list;
    }
}
