package mvcTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mvcTest.model.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
