package dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Scanner;

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
public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("0.exit 1.register 2.findByIdd 3.findByName 4.memberList 5.count 6.update 7.remove");

            switch (s.next()){
                case "0": return;
                case "1": return;
                case "2": return;
                case "3": return;
                case "4": return;
                case "5": return;
                case "6": return;
                case "7": return;
                default: break;

            }
        }
    }
    @Data @AllArgsConstructor class  Member{
        protected String userid,name,password,profileImg,phone,email;
    @Override public String toString(){
        return String.format("사용자 스펙:userid:%s,name:%s,password:%s,profileImg:%s,phone:%s,email:%s",userid,name,password,profileImg,phone,email);
    }
    }
    @RequiredArgsConstructor
    class MemberService{
        private Map<String, Member> map;
        void register(Member member){map.put(Member::getUserid,member);}
    }
}
