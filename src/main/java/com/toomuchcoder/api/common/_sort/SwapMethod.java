package com.toomuchcoder.api.common._sort;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : 퀵정렬1.java
 * author          : solyikwon
 * date            : 2022-06-20
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-20         solyikwon      최초 생성
 **/
public class SwapMethod {
    static void swap(int[] arr,int start,int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        return;
    }
}
