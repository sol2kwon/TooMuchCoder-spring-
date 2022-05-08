package com.toomuchcoder.api.repositories;

import com.toomuchcoder.api.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: repositories
 * fileName        : UserRepository.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    void put(User user);

    String login(User user);
}
