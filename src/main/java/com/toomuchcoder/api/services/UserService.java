package com.toomuchcoder.api.services;
import com.toomuchcoder.api.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.services
 * fileName        : UserService.java
 * author          : solyikwon
 *
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/

public interface UserService {
    String login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String put(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);
}
