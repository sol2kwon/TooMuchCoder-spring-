package streams;

import lombok.*;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: streams
 * fileName        : HelloStream.java
 * author          : solyikwon
 * date            : 2022-05-16
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-16         solyikwon      최초 생성
 **/
//한국어 안녕, 영어 Hello
public class HelloStream {
    //Data 게터 세터 합친거
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Hello {
        protected String greeting, inLanguage;

        /**
        public Hello(Builder builder) {
            this.greeting = builder.greeting;
            this.inLanguage = builder.inLanguage;
        }

        @NoArgsConstructor
        static public class Builder {
            private String greeting, inLanguage;

            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }
            public Builder inLanguage(String inLanguage) {
                this.inLanguage = inLanguage;
                return this;
            }
        }*/

        @Override
        public String toString() {
            return String.format("[인사말] %s, %s",inLanguage, greeting);
        }
    }

    interface HelloService {
        Set<Hello> greet(List<Hello>arr);
    }

    static class HelloServiceImpl implements HelloService {
        @Override
        public Set<Hello> greet(List<Hello>arr) {
           return   arr
                    .stream()
                    .filter(e->e.getInLanguage().equals("영어"))
                    .collect(Collectors.toSet());
        }
    }

    @Test
    void helloTest() {
        List<Hello>arr = Arrays.asList(
            Hello.builder().inLanguage("영어").greeting("Hello").build(),
            Hello.builder().inLanguage("한국어").greeting("안녕").build()
            );
        new HelloServiceImpl()
                .greet(arr)
                .forEach(System.out::println);
        }
    }



