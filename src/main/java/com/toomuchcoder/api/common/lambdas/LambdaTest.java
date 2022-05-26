package com.toomuchcoder.api.common.lambdas;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

import static com.toomuchcoder.api.common.lambdas.Lambda.string;

/**
 * packageName: com.toomuchcoder.api.common.lambdas
 * fileName        : LambdaTest.java
 * author          : solyikwon
 * date            : 2022-05-26
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-26         solyikwon      최초 생성
 **/
public class LambdaTest {


    public static String date(){
        Supplier<Date> f= Date :: new;
        return String.valueOf(f.get()) ;
    }
    public static String a(){
        Supplier<String> f =()-> string(new Date());
        return f.get();
    }
    public static String c(){
        Supplier<String> f = () -> string(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
        return f.get();
    }
    @Test
    public void testSolution(){
        System.out.println(date());
        System.out.println(a());
        System.out.println(c());

    }
}
