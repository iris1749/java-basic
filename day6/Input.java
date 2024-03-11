package day6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 출력 : 프로그램이 어떤 값을 콘솔창(표준 출력)에 출력
        // 입력 : 프로그램에 어떤 값을 콘솔창(표준 입력 = 키보드)에서 입력

        Scanner scan = new Scanner(System.in); // 표준입력
//        int num = scan.nextInt(); // 정수 입력

//        System.out.printf("당신이 입력한 값은 : %d\n", num);
//
//        String str = scan.next();
//        System.out.printf("당신이 입력한 문자열은 : %s\n", str);

        // 구구단의 단을 입력받아 해당 단을 출력해주는 프로그램을 만들어라.
        // 예시 )
        // 단을 입력해주세요 : 3
        // 3단을 출력

        // 단을 입력해주세요 : 5
        // 5단을 출력

        int dan = scan.nextInt();

        System.out.printf("단을 입력해주세요 : %d\n", dan);
        System.out.println(dan + "단을 출력합니다.");

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }


    }
}
