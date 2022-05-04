package com.toomuchcoder.api.domains;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: com.toomuchcoder.api.domains
 * fileName        : User.java
 * author          : solyikwon
 * date            : 2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/
//const [user, setUser] = useState({
//        userid: '',
//        password: '',
//        email: '',
//        name: '',
//        phone: '',
//        birth: '',
//        address: ''
//    })

@Component //컴포넌트 프로퍼티와 메소드의 집합
@Data //리액트에서
@Entity
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String userid;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;

}
