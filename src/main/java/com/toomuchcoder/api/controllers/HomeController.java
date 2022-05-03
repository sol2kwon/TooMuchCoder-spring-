package com.toomuchcoder.api.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * packageName: com.toomuchcoder.api.controllers
 * fileName        : HomeController.java
 * author          : solyikwon
 * date            : 2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03         solyikwon      최초 생성
 **/
public class HomeController {
    @RestController
    public class CommonController {
        @GetMapping("/")
        public String now(){
            return new SimpleDateFormat("yyyy-MM-dd hh:dd:ss").format(new Date());
        }
    }
}
