package day6;

public class AccessModifier {
    public static void main(String[] args) {

        // 접근제어자 ==> 인스턴트변수와 메서드, 클래스에 사용
        // public, protected, default, private
        // public : 모든 클래스에서 접근 가능
        // protected : 같은 패키지 내의 클래스와 다른 패키지의 상속관계에 있는 클래스에서 접근 가능
        // default : 같은 패키지 내의 클래스에서 접근 가능
        // private : 같은 클래스 내에서만 접근 가능

        // alt + enter로 자동 임포트 가능

        Test t1 = new Test();
        t1.a = 10;
        System.out.println(t1.a);

//        Test2 t2 = new Test2();
//        t2.a = 20; // 같은 패키지 안에서도 사용 불가
//        LGTv tv = new LGTv();

    }
}

class Test {
    public int a; //default -> 접근제어자 생략 가능;
}

//class Test2 {
//    private  int;
//}