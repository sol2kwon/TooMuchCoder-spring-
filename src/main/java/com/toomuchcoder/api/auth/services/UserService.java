package com.toomuchcoder.api.auth.services;

import com.toomuchcoder.api.auth.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: services
 * fileName        : UserService.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
public interface UserService {

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    String login(User user);

    void update(User user);
}
