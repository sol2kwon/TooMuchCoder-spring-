package com.toomuchcoder.api.auth.repositories;

import com.toomuchcoder.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
    // 000. 사용자의 비밀번호와 이메일을 수정하시오
    @Modifying
    @Query(value="update User u set u.password = :password, u.email = :email where u.userId = :userId",
            nativeQuery = true)
    int update(@Param("password") String password, @Param("email") String email);


    @Query(value = "")
    String login(User user);
}

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
