package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    List<Member> findByRegDtBetweenOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime eDate);
    List<Member> findByRegDtBetweenAndNameContainingOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime eDate, String keyword);

    @Query("SELECT * FROM MEMBER WHERE regDt BETWEEN :sdate AND :edate AND name LIKE :key ORDER BY regDt DESC")
    List<Member> getMembers(@Param("sdate") LocalDateTime sdate,
                            @Param("edate") LocalDateTime eDate,
                            @Param("key") String keyword);
}
