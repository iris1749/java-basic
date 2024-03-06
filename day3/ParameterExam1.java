package day3;

public class ParameterExam1 {

    public static void print(int num1) {

        if(num1 == 4) {
            System.out.println(4);
        }
        if(num1 == 10) {
            System.out.println(10);
        }
        if(num1 == 100) {
            System.out.println(100);
        }

    }
    public static void main(String[] args) {
        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100
    }
}
