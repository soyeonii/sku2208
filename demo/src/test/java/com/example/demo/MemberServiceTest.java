package com.example.demo;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    public void getAll() throws Exception {
        Member member1 = new Member("soyoen", "이소연", "1234", "soyeon@naver.com");
        Member member2 = new Member("test", "테스트", "1234", "test@naver.com");
        memberService.addMember(member1);
        memberService.addMember(member2);

        List<Member> all = memberService.getMembers();
        System.out.println("------------");
        for (Member member : all) {
            System.out.println(member.getId());
            System.out.println(member.getName());
            System.out.println(member.getJoinDate());
            System.out.println("------------");
        }
    }
}
