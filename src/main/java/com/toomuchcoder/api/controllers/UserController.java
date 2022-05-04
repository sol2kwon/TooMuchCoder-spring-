package com.toomuchcoder.api.controllers;

import com.toomuchcoder.api.domains.User;
import com.toomuchcoder.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.hibernate.criterion.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.controllers
 * fileName        : UserController.java
 * author          : solyikwon
 * date            : 2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/
@RestController //레스트컨트롤러는 @컴포넌트 자식이다.
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService service;
    @PostMapping("/join")
    public String join(@RequestBody User user){
        return null;
    }
    @PostMapping("/login")
    public String login(){
        return service.login(user);
}
    @PostMapping("/logout")
    public String logout(){
        return null;
}
    @GetMapping("/findAll")
    public List<User> findAll() {
        return null;
    }
    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return null;
    }
    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return null;
    }
    @GetMapping("/count")
    public long count() {
        return 0;
    }
    @PutMapping("/put")
    public void put(@RequestBody User user) {
    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) {
        return service.delete(user);
    }
    @PostMapping("/join")
    public String save(@RequestBody User user) {
        return service.save(user);
    }
    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }
    @PostMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return false;
    }
}
