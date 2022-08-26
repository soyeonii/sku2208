package com.example.demo;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entity.MemberEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void getMember() throws Exception {
    }

    @Test
    public void getMembers() throws Exception {
        MemberEntity memberEntity = new MemberEntity("soyeon", "lee", "1234", "soyeon@gmail.com");
        memberRepository.save(memberEntity);

        List<MemberEntity> all = memberRepository.findAll();
        for (MemberEntity me : all) {
            System.out.println(me);
        }
    }
}
