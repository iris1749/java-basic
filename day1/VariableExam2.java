package day1;

public class VariableExam2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터

        int c = a;  // a의 기존 값을 저장하는 역활을 함.
        a = b;      // a의 값을 b의 값으로 대체하는 역확.
        b = c;      // a의 기존 값을 불러와 b의 값을 a의 기존 값으로 대체 하는 역활.

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
