package com.toomuchcoder.api.board.controllers;

import com.toomuchcoder.api.board.services.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: controllers
 * fileName        : BoardController.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 **/
@RestController
@RequestMapping
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;


}
