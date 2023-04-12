package com.chanseok.studywithme.config.security;

import com.chanseok.studywithme.domain.Member;
import com.chanseok.studywithme.dto.response.MemberResponse;
import com.chanseok.studywithme.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email);

        if(member == null) {
            throw new UsernameNotFoundException(String.format("%d not found user", email));
        }

        MemberResponse response = new MemberResponse().toDto(member);
        List<GrantedAuthority> roles = new ArrayList<>();

        return new UserContext(response, roles);
    }
}
