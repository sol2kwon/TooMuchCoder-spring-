package com.toomuchcoder.api.security.domain;

import com.toomuchcoder.api.auth.domains.Role;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.security.domain
 * fileName        : SecurityProvider.java
 * author          : solyikwon
 * date            : 2022-05-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23         solyikwon      최초 생성
 **/
//시큐리티는 스프링꺼라서 컴포넌트 걸어줌
@Component
@RequiredArgsConstructor
@Log //아이피 다 찍어야함
//프로바이더는 AOP가 제공하는
public class SecurityProvider implements AuthenticationProvider {
    private final UserDetailsServiceImpl service;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securitykey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private  long validityInMs = 3600000;//1h

    @PostConstruct
    protected void init(){
        securitykey = Base64.getEncoder().encodeToString(securitykey.getBytes());
        log.info("securitykey"+securitykey);
    }
    public String createToken(String username, List<Role> roles){
        return "";
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
