package org.koreait.member.mappers;

import org.koreait.member.entities.Member;

import java.util.List;
import java.util.Optional;

public interface MemberMapper {
    int register(Member member);
    int update(Member member);

    int delete(String email);

    Optional<Member> get(String email);
    List<Member> getList();

}
