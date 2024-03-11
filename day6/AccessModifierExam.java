package day6;
// 문제 : 값이 출력되게 해주세요.
public class AccessModifierExam {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.id = 20;

        System.out.println("제 번호는 " + p1.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.

    }
}

class Person2 {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    int id;
}