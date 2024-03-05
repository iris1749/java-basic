package day2;

public class LoopExam2 {
    public static void main(String[] args) {
        // 문제1. 1 ~ 100까지 수중 짝수만 출력
        //2
        //4
        //6
        //8
        //...
        //100
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);// 짝수일 때만 실행
            }
        }
        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
        //1:odd
        //2:even
        //3:odd
        //4:even
        //5:odd
        //6:even
        //7:odd
        //8:even
        //...
        //100:even

        for(int j = 1; j <= 100; j++) {
            if (j % 2 == 1) {
                System.out.println(j + ":odd");// 짝수일 때만 실행
            }
            if (j % 2 == 0) {
                System.out.println(j + ":even");// 짝수일 때만 실행
            }
        }
    }
}
