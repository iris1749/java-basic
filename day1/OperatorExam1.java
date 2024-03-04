package day1;

public class OperatorExam1 {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println();
        }

        if ( false ) {
            System.out.println();
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참"); //true
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓"); //false
        }

        if ( a > 10 ) {
            System.out.println("거짓"); //false
        }

        if ( a >= 10 ) {
            System.out.println("참");  //true
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참"); //true
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;  //false

        if ( c ) {
            System.out.println("거짓"); //false
        }

        if ( c == false ) {
            System.out.println("참"); //true
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참"); //true
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓"); //false
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참"); //true
        }
    }
}
