package com.toomuchcoder.api.common.lambda;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.toomuchcoder.api.common.dataStructure.AppleList.Apple;

/**
 * packageName: com.toomuchcoder.api.common.lambda
 * fileName        : Lambda.java
 * author          : solyikwon
 * date            : 2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11         solyikwon      최초 생성
 **/
public class Lambda {
    public static void main(String[] args) {
        //System.out.println(integer("900"));
        //System.out.println(Lambda.string(1));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(
                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("영동").color("RED").price(3000).build()
                        ))
               );
        System.out.println(array(10).length);
    }
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String string(Object o){
        //String s = String.valueOf(o)

        Function<Object,String> f = String::valueOf;
        return f.apply(o);

}
    public static boolean equals(String s1, String s2){
        BiPredicate<String,String> f = String::equals;
        return f.test(s1,s2);
    }
    //int[] arr = new int [8] 클래식 자바
    // 이름은 array  int type size를 파라미터를 던지면 배열이나온다 열칸짜리..들어가는 값이 인트이고 나오는건 인트 집합
    // = int[]::new

    public static int[] array(int a){
            Function<Integer,int[]> f = int[]::new;
        return f.apply(a);

    }
    }

