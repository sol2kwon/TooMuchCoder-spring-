package com.toomuchcoder.api.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

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
        AppleService service = new AppleServiceImpl();
        while (true){
            System.out.println("0.나가기 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (a.next()){
                case "0":return;
                case "1":
                    Apple yd = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    Apple yd1 = new Apple.Builder()
                            .origin("영동")
                            .color("BlUE")
                            .price(1500)
                            .build();
                    service.save(yd1);
                    Apple pg = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":
                    System.out.println("5.findByOrigin");
                    System.out.println(service.findByOrigin("영동"));
                    break;
                case "6":
                    System.out.println("6.findAll: \n"+service.findAll());
                    break;
                case "7":
                    System.out.println("총 회원수: "+service.count()+"명");
                    break;
                case "8":break;
                case "9":
                service.clear();
                break;

                default:break;
            }

        }
    }
    @Data
    static class Apple{
        protected String color,origin;
        protected int price;

        public Apple(Builder builder){
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
        @Override public  String toString(){
            return String.format("[사과 스펙] origin: %s, color:%s, price: %d",color,origin,price );
        }
    }

    interface AppleService{
        void save(Apple apple);
        void update(int i,Apple apple);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple>findByOrigin(String origin);
        List<Apple>findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();


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
        public void update(int i,Apple apple) {
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
            return filterApplesByOrigin(this.list,origin);

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

        @Override
        public void clear() {
            list.clear();
        }
    }
    static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    static List<Apple> filterApplesByOrigin(List<Apple> list, String origin){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: list){
            if(origin.equals(apple.getOrigin())){
                result.add(apple);
            }
        }
        return result;
    }

}
