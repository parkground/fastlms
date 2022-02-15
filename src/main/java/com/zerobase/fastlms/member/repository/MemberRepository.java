package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.membe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {

}
