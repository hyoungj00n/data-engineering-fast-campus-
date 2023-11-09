package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

public record RegisterMemberCommand( //Record를 이용하면 getter setter를 자동으로 만들어주고 getter를 property형식으로 사용할 수 있다.
                                     String email,
                                     String nickname,
                                     LocalDate birthday


) {

}

