package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.net.PortUnreachableException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

/**
 * packageName: streams
 * fileName        : PersonStream.java
 * author          : solyikwon
 * date            : 2022-05-16
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-16         solyikwon      최초 생성
 **/
public class PersonStream {
    @Getter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Person{
        protected String name,ssn;

        public String toString(){
            int age = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - (1900+Integer.parseInt(ssn.substring(0,2)));
            int age1 = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - (2000+Integer.parseInt(ssn.substring(0,2)));
            int age2 = ssn.substring(7).equals("1")||ssn.substring(7).equals("2")?age:age1;
            String gender = ssn.substring(7).equals("1")||ssn.substring(7).equals("3")?"남자":"여자";
            return String.format("이름 %s,성별 %s 나이 %s ", name, gender,age2);
        }
    }

    @FunctionalInterface interface PersonService {

        Person search(List<Person> arr);
    }


    @Test
    void personTest(){
        List<Person> arr = Arrays.asList(
           Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("000928-4").build()
        );

        PersonService ps = persons -> persons
                .stream()
                .filter(e->e.getName().equals("홍길동"))
                .collect(Collectors.toList()).get(0);
        System.out.println(ps.search(arr));

    }
}
