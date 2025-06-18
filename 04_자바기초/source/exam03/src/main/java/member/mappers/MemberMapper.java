package member.mappers;

import member.entities.Member;

import java.util.List;
import java.util.Optional;

public interface MemberMapper {
    int getTotal();
    Optional<Member> get(String email);
    List<Member> getList();
}
/*
public interface MemberMapper {
    @Select("SELECT COUNT(*) FROM member")
    int getTotal();

    @Select("SELECT seq, email, name, mobile, terms, regDt FROM member WHERE email=#{email}")
    //Member getMember(String email);
    Optional<Member> getMember(String email);

    @Insert("INSERT INTO member (email, password, name, mobile) VALUES (#{email}, #{password}, #{name}, #{mobile})")
    int register(@Param("email") String email,
                 @Param("password") String password,
                 @Param("name") String name,
                 @Param("mobile") String mobile);
}
*/
