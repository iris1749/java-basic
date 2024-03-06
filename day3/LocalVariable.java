package day3;

import java.util.Enumeration;

public class LocalVariable {
    public static int test() {
        int num = 10;

        return num;
    }
    public static void introduce() {
        int age = 20;
        System.out.println("안녕하세요 저는 " + age + "살입니다.");
        System.out.println("인류의 평균 나이는 " + Person.averageAge + "살입니다.");
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

        Person p1 = new Person();
        p1. age = 20;
        p1. name = "홍길동";
        p1. home = "서울";

        p1.introduce(); // 안녕하세요 저는 20살 홍길동입니다.
        p1.addAge(); // 나이 1 증가
        p1.introduce(); // 안녕하세요 저는 21살 홍길동입니다.

        Person p2 = new Person();
        p2. age = 30;
        p2. name = "이순신";
        p2. home = "부산";

        p2.introduce(); // 안녕하세요 저는 30살 이순신입니다.
        p2.addAge(); // 나이 1 증가
        p2.introduce(); // 안녕하세요 저는 31살 이순신입니다.



    }
}
