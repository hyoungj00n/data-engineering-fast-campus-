package com.example.fastcampusmysql.domain.member.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public class Member {
    final private Long id;

    private String nickname;

    final private String email;

    final private LocalDate birthday;

    final private LocalDate createAt;//debugging시 도움 된다.

    final private static Long NAME_MAX_LENGTH = 10L;
    @Builder //constructor 생성 단축키 cmd+n하고 shift로 전체 선택 가능
    public Member(Long id, String nickname, String email, LocalDate birthday, LocalDate createAt) {
        this.id = id;
        this.email = Objects.requireNonNull(email); 
        this.birthday = Objects.requireNonNull(birthday); validateNickname(nickname);
        this.nickname = Objects.requireNonNull(nickname);


        this.createAt = createAt == null ? LocalDate.now() : createAt;
    }

    void validateNickname(String nickname){
        Assert.isTrue(nickname.length() <= NAME_MAX_LENGTH,"최대 길이 초과");
    }
}
