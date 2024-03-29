package day2;

public class Loop {
    public static void main(String[] args) {
        // 반복문을 이용해 동일한 명령을 여러번 실행

//       while(true) {
//            System.out.println("실행");
//        }
        // 여러줄을 주석처리할땐 주석처리할 코드를 드래그해서 ctrl + /

        // 원하는 만큼만 반복

        int cnt = 0;  // 반복횟수 세는 용도

        while(cnt < 5) {
            System.out.println("실행");
            cnt++;
        }

        // for 문
        for(int cnt2 = 0; cnt2 < 5; cnt2++) {
            System.out.println("1");
        }

        // 1부터 10까지 출력

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 ver.1

        for(int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 ver.2
        // 2의 배수 == 짝수
        // 2의 배수는 2로 나누었을때 나머지가 0임
        // 나머지를 구하는 연산자 %

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);// 짝수일 때만 실행
            }
        }


        // 1부터 10까지 4의 배수 출력

        for(int i = 4; i <= 10; i+=4) {
            System.out.println(i);
        }

    }
}
