package com.example.fastcampusmysql.domain.member.repository;

import com.example.fastcampusmysql.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MemberRepository {
    final private NamedParameterJdbcTemplate jdbcTemplate;
    public Member save(Member member){

        return member;
    }


    //jdbc template 이용
    private Member insert(Member member){
        //jpa는 id값이 없는 member를 받아서 insert를 하면 id값을 받아서 준다.
        //KeyHolder(지저분해질 수 있음) or SimpleJdbcInsert
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate.getJdbcTemplate())
                .withTableName("Member")
                .usingGeneratedKeyColumns("id");
    }

    private Member update(Member member){
        //TODO : implemented
        return member;
    }
}
