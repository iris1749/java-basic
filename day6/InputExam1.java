package day6;

// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
// 조건 : 성과 이름은 띄어쓰기로 구분해주세요.
import java.util.Scanner;
public class InputExam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

//        System.out.println("이름을 입력해주세요.");
//        String namev1 = scan.nextLine();
//        System.out.println("나이를 입력해주세요.");
//        int agev1   = scan.nextInt();
//        System.out.printf("안녕하세요 %d세 %s입니다.\n", agev1, namev1);



        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        System.out.println("나이를 입력해주세요.");
        int agev2 = scan.nextInt();

        scan.nextLine(); // 버퍼 바꾸기

        System.out.println("이름을 입력해주세요.");
        String namev2 = scan.nextLine();
        System.out.printf("안녕하세요 %d세 %s입니다.\n", agev2, namev2);

    }
}
