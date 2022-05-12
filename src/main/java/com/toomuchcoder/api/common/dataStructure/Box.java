package com.toomuchcoder.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: com.toomuchcoder.api.common.dataStructure
 * fileName        : Box.java
 * author          : solyikwon
 * date            : 2022-05-12
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-12         solyikwon      최초 생성
 **/
@Component @Data @Lazy//Lazy loading
 public class Box<T> {
    private final ArrayList<T> list;
    public Box(){this.list = new ArrayList<>();}
    // save, update, delete, findAll, findByName, findById, count, existsById, clear
    // add, set, remove, get(), X, get(i), size, X, clear


    public void add(T t){
        list.add(t);
    }

    public void set(int i,T t){
        list.set(i,t);
    }

    public void remove(T t){
        list.remove(t);
    }

    public ArrayList <T> findAll (){
        return list;
    }

    public ArrayList <T> findByName(String name) {
        return null;
    }

    public T get(int i) {
        return list.get(i);
    }

    public void clear() {
        list.clear();
    }

}
