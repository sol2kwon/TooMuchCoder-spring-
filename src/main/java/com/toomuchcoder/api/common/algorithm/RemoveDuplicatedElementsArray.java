package com.toomuchcoder.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : RemoveDuplicatedElementsAarry.java
 * author          : solyikwon
 * date            : 2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17         solyikwon      최초 생성
 **/
public class RemoveDuplicatedElementsArray {
    @Getter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Duplicate{
        protected int [] arr;
        private int set;

        @Override
        public String toString(){
            return String.format("새 배열 %d",arr);
        }
    }
    @FunctionalInterface private interface DuplicateSolution{
        HashSet<Integer> hashSet( HashSet<Integer> hashSet);
    }
    @Test
    void testDuplicate() {
        int[] arr = {3, 10, 9, 27, 2, 8, 10, 4, 27, 1};

       
    }}
