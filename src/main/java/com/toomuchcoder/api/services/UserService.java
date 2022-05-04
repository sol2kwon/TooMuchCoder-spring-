package com.toomuchcoder.api.services;

import com.toomuchcoder.api.domains.User;

/**
 * packageName: com.toomuchcoder.api.services
 * fileName        : UserService.java
 * author          : solyikwon
 *
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/

public interface UserService {
    String join(User user);
    String login(User user);
    String logout(User user);

}
