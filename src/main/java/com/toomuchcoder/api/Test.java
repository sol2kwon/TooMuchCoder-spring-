package com.toomuchcoder.api;
import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api
 * fileName        : Test.java
 * author          : solyikwon
 * date            : 2022-06-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-09         solyikwon      최초 생성
 **/
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int position = 3;
        int[] arr1 = new int[position];
        int[] arr2 = new int[arr.length-position];

        for (int i = 0; i<arr.length; i++){
            if (i<position){
                arr1[i] = arr[i];

            }else {
                arr2[i-position] =arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
