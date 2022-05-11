package com.toomuchcoder.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Member;
import java.util.*;
import java.util.function.BiConsumer;

/**
 * packageName: dataStructure
 * fileName        : MemberCRUD.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 **/
@RequiredArgsConstructor
public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while(true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0":return;
                case "1":
                Member hong = new Member.Builder("hong")
                                .email("hong@test.com")
                                .password("1")
                                .name("홍길동")
                                .phone("010-9000-9000")
                                .profileImg("hong.jpg")
                                .build();
                    service.save(hong);
                    Member kim = new Member.Builder("kim")
                            .email("kim@test.com")
                            .password("2")
                            .name("김유신")
                            .phone("010-0044-9944")
                            .profileImg("kim.jpg")
                            .build();
                    service.save(kim);
                    Member you = new Member.Builder("you")
                            .email("you@test.com")
                            .password("3")
                            .name("유관순")
                            .phone("010-0800-9889")
                            .profileImg("you.jpg")
                            .build();
                    service.save(you);
                    break;
                case "2":
                    break;
                case "3":
                    Member temp = new Member();
                    temp.setUserid("kim");
                    service.delete(temp);
                    break;
                case "4":
                    System.out.println(service.findByName("유관순"));
                    break;
                case "5":break;
                case "6":break;
                case "7":
                    System.out.println(service.count()+"명");
                    break;
                case "8":
                    break;

                case "9":
                    service.clear();
                    break;
                default:break;
            }
        }
    }//컨트롤러
    @Data @NoArgsConstructor
        static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder){
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;

        }
        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name (String name){this.name=name;return this;}
            public Builder password (String password){this.password=password;return this;}
            public Builder profileImg (String profileImg){this.profileImg=profileImg;return this;}
            public Builder phone(String phone){this.phone=phone;return this;}
            public Builder email (String email){this.email=email;return this;}
            Member build(){return new Member(this);}


        }

        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }//도메인

    interface MemberService{
        void save(Member member);

        void update(Member member);

        void delete(Member member);

        Member findById(String id);

        List<Member> findByName(String name);

        List<Member> findAll( );

        int count();

        boolean existsById(String id);

        void clear();
    }

    static class MemberServiceImpl implements MemberService{
       private final Map<String,Member>map;
       List<Member> list = new ArrayList<>();

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }// 바깥쪽에 주면 보안 뚫림 기능 죽음 위험함..
        @Override public void save(Member member){ map.put(member.getUserid(), member);}

        @Override
        public void update(Member member) {map.replace(member.getUserid(),member);}

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid(),member);

        }

        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>)map.get(name);}

        @Override
        public List<Member> findAll() {
            return null;}

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existsById(String id) {
            return map.containsKey(id);}

        @Override
        public void clear() {
             map.clear();
        }
    }
}//서비스
