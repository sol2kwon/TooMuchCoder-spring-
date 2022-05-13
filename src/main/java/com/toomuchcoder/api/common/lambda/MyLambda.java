package com.toomuchcoder.api.common.lambda;

/**
 * packageName: com.toomuchcoder.api.common.lambda
 * fileName        : MyLambda.java
 * author          : solyikwon
 * date            : 2022-05-13
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-13         solyikwon      최초 생성
 **/
public class MyLambda {
    @FunctionalInterface interface MyFunction{int apply(String arg);} //커스텀한다는 뜻
    @FunctionalInterface interface MySupplier{int get();}
    @FunctionalInterface interface MyConsumer{void accept(String arg);}
    @FunctionalInterface interface MyPredicate{boolean test(String arg);}
    @FunctionalInterface interface MyInterface{String myMethod();}
    @FunctionalInterface interface MyUnaryOp {int operator(Integer a);}
    @FunctionalInterface interface LengthOfString{int execute(String arg);}



}
