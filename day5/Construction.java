package day5;

public class Construction {
    public static void main(String[] args) {
        people apeople = new people(20, "홍길동", "서울");
        // 객체의 데이터를 세팅 -> 객체 초기화
//        apeople.reset(20, "홍길동", "서울");
//        apeople.Introduce();

        people apeople2 = new people(30, "홍길순", "부산");
        // 객체 초기화는 꼭 필요한데 실수로 누락할 수 있다.
//        apeople2.reset(30, "홍길순", "부산");
//        apeople2.Introduce();
    }
}

class people {
//    int age;
//    String name;
//    String home;
    // 함수의 지역변수와 객체의 인스턴스 변수는 동일한 이름으로 존재 가능

    // 생성자 -> 객체가 생성될 때 자동으로 호출되는 메서드
    // 작성 규칙 -> 리턴타입 x, 이름은 무조건 클래스 이름과 동일하게

    // public people () {} // 기본 생성자. 안만들면 자바가 자동으로 만들어줌.
    // 다만, 내가 생성자를 의도적으로 만들면 자바는 더이상 기본 생성자를 만들지 않음.
    public people (int age, String name, String home) {
        System.out.println("사람이 한명 만들어집니다.");
        System.out.println("안녕하세요 저는" + age + "살" + name + "입니다.");
    } // new people 과정에서 실행됨.

//    public  void reset (int age, String name, String home) {
//        // this는 객체를 가리킨다.
//        this.age = age;
//        this.name = name;
//        this.home = home;
//    }

//    public void Introduce() {
//        System.out.println("안녕하세요 저는" + age + "살" + name + "입니다.");
//    }
}
