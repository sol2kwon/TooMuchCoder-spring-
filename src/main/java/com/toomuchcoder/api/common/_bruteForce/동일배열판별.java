package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: com.toomuchcoder.api.common._bruteForce
 * fileName        : 동일배열판별.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 동일배열판별 {

        public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};

        Set<Integer> distinct = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        boolean allEqual = distinct.size() == 1;
        System.out.println(allEqual);
    }
}
