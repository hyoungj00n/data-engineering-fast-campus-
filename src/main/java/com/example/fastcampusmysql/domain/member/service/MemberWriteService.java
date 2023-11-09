package com.example.fastcampusmysql.domain.member.service;

import com.example.fastcampusmysql.domain.member.dto.RegisterMemberCommand;
import com.example.fastcampusmysql.domain.member.entity.Member;
import com.example.fastcampusmysql.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 의존성 주입 받으려면 생성자 있어야 해서 생성자 생성 annotation
public class MemberWriteService {
    final private MemberRepository memberRepository;
    public void create(RegisterMemberCommand command){
        /*
        요구사항
        - 회원 정보(이메일, 닉네임, 생년월일) 등록
        - 닉네임 10자 이내로
         */
        var member = Member.builder()//Member 클래스에 Builder annotation 사용
                .nickname(command.nickname())// record 사용해서 사용 가능
                .email(command.email())
                .birthday(command.birthday())
                .build();
        memberRepository.save(member);

    }
}
