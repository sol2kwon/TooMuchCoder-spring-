package com.toomuchcoder.api.user.services;

import com.toomuchcoder.api.user.domains.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.toomuchcoder.api.user.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

/**
 * packageName: services
 * fileName        : UserServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void update(User user) {
        return;
    }


    @Override
    public String delete(User user) {
        repository.delete(user);
        return "";
    }

    @Override
    public String save(User user) {
        repository.save(user);
        return "";
    }

    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String userid) {
        return repository.existsById(0L);
    }

    @Override
    public String login(User user) {
        return "";

    }
}


