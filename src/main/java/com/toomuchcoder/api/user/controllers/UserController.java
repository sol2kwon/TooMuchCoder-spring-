package com.toomuchcoder.api.user.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.user.domains.User;
import com.toomuchcoder.api.user.domains.UserDTO;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import com.toomuchcoder.api.user.services.UserService;


import java.util.List;
import java.util.Optional;

/**
 * packageName: controllers
 * fileName        : UserController.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
@CrossOrigin(origins = "*",allowedHeaders = "*")//나중에 아마존에서 발급하면 체인지함
@Api(tags = "users")
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")

public class UserController {
    private final UserService service;
    private final ModelMapper modelMapper;// 맵 1:1,필터 ??,리듀서 1:다

    @PostMapping("/login")
    @ApiOperation(value = "${UserController.login}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something Wrong"),
            @ApiResponse(code = 422, message = "유효하지 않은 아이디/비밀번호")
    })
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO user){
        return ResponseEntity.ok(service.login(modelMapper.map(user,User.class)));
    }

    @PostMapping("/logout")
    public ResponseEntity<Messenger> logout(){
        return null;
                //ResponseEntity.ok(service.logout));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return null;
                //ResponseEntity.ok(service.findAll));
    }
    @GetMapping("/findAll/sort")
    public ResponseEntity<List<User>> findAll(Sort sort) {
        return ResponseEntity.ok(service.findAll(sort)) ;
    }
    @GetMapping("/findAll/pageable")
    public ResponseEntity<Page<User>>findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }
    @PutMapping("/update")
    public  ResponseEntity<Messenger>  update(@RequestBody User user) {
       return ResponseEntity.ok (service.update(user));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(User user) {
        return ResponseEntity.ok( service.delete(user));

    }
    @PostMapping("/join")
    @ApiOperation(value = "${UserController.join}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something Wrong"),
            @ApiResponse(code = 403, message = "승인거절"),
            @ApiResponse(code = 422, message = "중복된 아이디")
    })
    public ResponseEntity<Messenger> save(@ApiParam("Join User") @RequestBody UserDTO user) {
        System.out.println("회원가입 정보: "+user.toString());//확인하고 지우기
        return ResponseEntity.ok(service.save(user)) ;
    }
    @GetMapping("/findById/{userid}")
    public ResponseEntity<Optional<User>> findById(@PathVariable String userid) {
        return ResponseEntity.ok (service.findById(userid));
    }

    @GetMapping("/existsById/{userid}")
    public  ResponseEntity<Messenger> existsById(@PathVariable String userid) {
        return  ResponseEntity.ok(service.existsById(userid));
    }


}

