package com.chanseok.studywithme.dto.response;

import com.chanseok.studywithme.domain.Member;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberResponse {
    private Long no;
    private String email;
    private String password;
    private String nickname;
    private String location;

    public MemberResponse() {
    }

    private MemberResponse(Long no, String email, String password, String nickname, String location) {
        this.no = no;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.location = location;
    }

    public MemberResponse toDto(Member member) {
        return new MemberResponse(member.getNo(), member.getEmail(), member.getPassword(), member.getNickname(), member.getLocation());
    }
}
