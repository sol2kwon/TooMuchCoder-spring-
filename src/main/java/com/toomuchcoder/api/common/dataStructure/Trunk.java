package com.toomuchcoder.api.common.dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.common.dataStructure
 * fileName        : Trunk.java
 * author          : solyikwon
 * date            : 2022-05-12
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-12         solyikwon      최초 생성
 **/
public class Trunk<T> {
    private final HashMap<T,Trunk> map;
    public Trunk(){this.map = new HashMap<>();}
    // save, update, delete, findAll, findByName, findById, count, existsById, clear
    // add, set, remove, get(), X, get(i), size, X, clear

    public void replace(T t){map.replace();}


    public void remove(T t) {
        map.remove();

    }


    public MemberCRUD.Member findById(String id) {
        return ;
    }


    public List<MemberCRUD.Member> findByName(String name) {
        return ;}


    public List<MemberCRUD.Member> findAll() {
        return null;}


    public int size() {
        return map.size();
    }


    public boolean existsById(String id) {
        return map.containsKey(id);}


    public void clear() {
        map.clear();
    }

}
