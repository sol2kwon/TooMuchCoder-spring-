package com.toomuchcoder.api.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName: com.toomuchcoder.api.common.dataStructure
 * fileName        : AppleList.java
 * author          : solyikwon
 * date            : 2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11         solyikwon      최초 생성
 **/
//Apple color price origin
public class AppleList {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true){
            System.out.println("0.나가기 1.save 2.update 3.delete");
            switch (a.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                default:break;
            }

        }
    }
    @Data
    static class Apple{
        protected String color,origin;
        protected int price;

        public Apple(Apple.Builder builder){
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }
        @NoArgsConstructor static class Builder{
            private String color,origin;
            private int price;
            public Builder color (String color){this.color=color;return this;}
            public Builder origin (String origin){this.origin=origin;return this;}
            public Builder price (int price){this.price = price;return this;}
            Apple build(){return new Apple(this);}
        }
    }

    interface AppleService{
        void save(Apple apple);
        void update(Apple apple, int i);
        void delete(Apple apple);
        List<Apple> findAll();

        List<Apple>findByOrigin(String origin);
        List<Apple>findByColor(String color);
        Apple findById(int i);
        int count();


    }
    static class  AppleServiceImpl implements AppleService{
        private final List<Apple> list;
        AppleServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Apple apple) {
            list.add(apple);

        }

        @Override
        public void update(Apple apple, int i) {
             list.set(i,apple);

        }

        @Override
        public void delete(Apple apple) {
            list.remove(apple);

        }

        @Override
        public List<Apple> findAll() {
          return list;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return null;
        }

        @Override
        public List<Apple> findByColor(String color) {
            return null;
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }
    }

}
