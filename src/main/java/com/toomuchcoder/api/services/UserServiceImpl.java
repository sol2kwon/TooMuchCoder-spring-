package com.toomuchcoder.api.services;

import com.toomuchcoder.api.domains.User;
import com.toomuchcoder.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.services
 * fileName        : UserServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;



}

