package com.toomuchcoder.api.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.common.dataStructure
 * fileName        : BmiList.java
 * author          : solyikwon
 * date            : 2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11         solyikwon      최초 생성
 **/
//height weight ssn(900101-1)
public class BmiList {
    public static void main(String[] args) {

    }
    @Data
    static class Bmi{
        protected double height,weight;
        protected String ssn;
    }
    interface BmiService{
        void save(Bmi bmi);
        void update(Bmi bmi,int i);
        void delete(Bmi bmi);
        List <Bmi> findAll();
        List <Bmi> findByGender(String gender);
        Bmi findById(int i);
        int count();

    }
    static class BmiServiceImpl implements BmiService{
    private final List<Bmi> list;

        BmiServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Bmi bmi) {
            list.add(bmi);

        }

        @Override
        public void update(Bmi bmi,int i) {
            list.set(i,bmi);

        }

        @Override
        public void delete(Bmi bmi) {
            list.remove(bmi);

        }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public Bmi findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }
    }
}
