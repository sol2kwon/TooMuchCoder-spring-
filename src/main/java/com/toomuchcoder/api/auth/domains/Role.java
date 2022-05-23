package com.toomuchcoder.api.auth.domains;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.auth.domains
 * fileName        : Rols.java
 * author          : solyikwon
 * date            : 2022-05-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23         solyikwon      최초 생성
 **/
@Getter //읽기만 가능 수정 불가능!
@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    ADMIN("ROLE_ADMIN", "관리자권한"),
    USER("ROLE_USER","사용자권한"),
    UNKNOWN_USER("ROLE_UNKNOWN_USER","알수없는 사용자"),
    ;
    private final String code;
    private final String description;

    public static Role of(String code) {
        return Arrays.stream(Role.values()).filter(i->i.getCode().equals(code))
                .findAny().orElse(UNKNOWN_USER);
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
