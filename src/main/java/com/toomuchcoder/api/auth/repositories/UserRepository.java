package com.toomuchcoder.api.auth.repositories;

import com.toomuchcoder.api.auth.domains.User;
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
interface UserCustomRepository{
    void update(User user);
    String login(User user);
}
@Repository
public interface UserRepository extends JpaRepository<User,Long>,UserCustomRepository {


}
