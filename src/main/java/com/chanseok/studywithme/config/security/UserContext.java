package com.chanseok.studywithme.config.security;

import com.chanseok.studywithme.dto.response.MemberResponse;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Locale;

public class UserContext extends User {
    private final MemberResponse response;

    public UserContext(MemberResponse response, Collection<? extends GrantedAuthority> authorities) {
        super(response.getEmail(), response.getPassword(), authorities);
        this.response = response;
    }

    public MemberResponse getResponse() {
        return response;
    }
}
