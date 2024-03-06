package day3;

public class ReturnExam4 {

    // 1 부터 n까지 수 중 짝수인 것만 출력
    public static void isEven(int num) {
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public static void printEven(int n) {

        isEven(n);

        // isEven 메서드를 이용.

    }
    public static void main(String[] args) {
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4
    }
}
