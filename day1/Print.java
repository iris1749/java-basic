package day1;

public class Print {
    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(124);
        System.out.println("가나");
        System.out.println("다라");

        // \n은 줄바꿈 명령어
        System.out.println("안녕하세요.\n반갑습니다.");

        // 문자 합치기
        // 기본적으로 출력은 한개만 가능함.
        // + 연산자 기호를 이용하여 출력이 가능함.
        // System.out.println("안녕하세요" "반갑습니다.");
        System.out.println("안녕하세요" + " 반갑습니다.");

        // 숫자 더하기
        System.out.println(100 + 200);

        // 숫자의 경우는 ""를 붙여 출력하게 되는경우 문자로 인식함.
        System.out.println("100" + "200");

        // 문자 + 숫자 = 숫자를 문자화 해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        System.out.println("100 + 200 = 300");

        // + 연산자가 여러번 나오는 경우 왼쪽부터 순차적으로 연산함
        // 우선 개산할경우 소괄호를 이용해서 만들수있다.
        System.out.println("123124+54632 = " + (123124 + 54653));

        // 숫자 곱하기
        System.out.println(100 * 200);

        // 예제 구구단 2단을 출력하세요. 단, 출력문은 한번만 사용.
        System.out.println("2 x 1 = 2\n2 x 2 = 4\n2 x 3 = 6\n2 x 4 = 8\n2 x 5 = 10\n2 x 6 = 12\n2 x 7 = 14\n2 x 8 = 16\n2 x 9 = 18");
        System.out.println("2 x 1 = " + (2 * 1) + "\n" + "2 x 2 = " + (2 * 2) + "\n" + "2 x 3 = " + (2 * 3) + "\n" + "2 x 4 = " + (2 * 4) + "\n" + "2 x 5 = " + (2 * 5) + "\n" + "2 x 6 = " + (2 * 6) + "\n" + "2 x 7 = " + (2 * 7) + "\n" + "2 x 8 = " + (2 * 8) + "\n" + "2 x 9 = " + (2 * 9) );

    }
}
