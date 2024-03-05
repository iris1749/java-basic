package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        // 1부터 5까지 3번 반복 출력하는 거

        for(int i = 0; i < 3; i++) {
            for(int j =1 ; j <= 5; j++) {
                System.out.println(j);
            }
        }

        //구구단 출력
        // 2단 출력

        for(int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        // 2단 출력 ver.2

        int dan = 0;
        dan = 2;

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }

        // 2단 8번 출력해보기

        int dan2 = 2;

        for(int j = 0; j < 8; j++) {
            for(int i = 1; i <= 9; i++) {
                System.out.println(dan2 + " x " + i + " = " + (dan2 * i));
            }
        }

        //구구단 2~9단 출력

        for(int i = 2; i <= 9; i++) {
            for(int j =1 ; j <= 9; j++) {
                  System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
