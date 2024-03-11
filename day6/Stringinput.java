package day6;

import java.util.Scanner;
public class Stringinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 문자열 입력 1 -> 단어입력
        // 문자열 입력 2 -> 문장입력

        String str1 = scan.next();
        System.out.println(str1);

        // 문장을 입력하고 싶으면 nextline();

        String str2 = scan.nextLine(); // 문장 입력, 엔터를 입력할때까지 입력을 받음
        System.out.println(str2);
    }
}
