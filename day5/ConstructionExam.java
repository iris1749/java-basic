package day5;

//다음 클래스들을 생성자를 이용해 간단하게 값을 세팅해주세요.
public class ConstructionExam {
    public static void main(String[] args) {

        Person p1 = new Person(); // 사람이 태어납니다.
        Person p2 = new Person(); // 사람이 태어납니다.

        p1.introduce (27, "홍길동"); // 안녕하세요 27살 홍길동입니다.
        p2.introduce (25, "홍길순"); // 안녕하세요 25살 홍길순입니다.

//      ---------------------------------------------------------------------------

        Car c1 = new Car(); // 자동차가 만들어집니다.
        Car c2 = new Car(); // 자동차가 만들어집니다.

        c1.drive("소나타", "하얀색", 100); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive("모닝", "검정색", 70); // 검정색 모닝이/가 70km로 달립니다.

//      -----------------------------------------------------------------------------

        Cat cat1 = new Cat(); // 고양이가 태어납니다.
        Cat cat2 = new Cat(); // 고양이가 태어납니다.

        cat1.meow("아리", 4, "러시안블루"); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow("망고", 6, "샴"); // 6살 샴 고양이 망고가 야옹하고 웁니다.

//      ------------------------------------------------------------------------------

        Warrior w1 = new Warrior(); // 전사가 태어납니다.
        Warrior w2 = new Warrior(); // 전사가 태어납니다.

        w1.status("이순신", 20, 10); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status("강감찬", 15, 15); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15
        w1.attack("이순신", 20); // 이순신이 20의 데미지를 입힙민다.
        w2.attack("강감찬", 15); // 강감찬이 15의 데미지를 입힙민다.
        w1.defense("이순신", 10); // 이순신이 10 데미지를 방어합니다.
        w2.defense("강감찬", 15); // 강감찬이 15 데미지를 방어합니다.

    }
}
// --------------------------------------------------------------------------------------------
class Person{
     public Person () {
         System.out.println("사람이 태어납니다.");
     }
    public void introduce (int age, String name) {

        System.out.printf("안녕하세요 " + age + "살 " + name +"입니다.\n");
    }
}

// -------------------------------------------------------------------------------
class Car {

    public  Car () {
        System.out.println("자동차가 만들어집니다.");
    }

    public void drive(String model, String color, int speed) {
//      System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);  이런식으로도 출력 가능 함. %s 는 문자 %d 는 숫자
        System.out.printf(color + " " + model + "이/가" + speed + " km로 달립니다.\n");
    }
}
// --------------------------------------------------------------------------------
class Cat {
    public  Cat () {
        System.out.println("고양이가 태어납니다.");
    }

    public void meow(String name, int age, String kind) {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}
// ---------------------------------------------------------------------------------
class Warrior {
    public  Warrior () {
        System.out.println("전사가 태어납니다.");
    }

    public void status(String name, int attack, int defense) {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }

    public void attack (String name, int attack) {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", name, attack);
    }

    public void defense(String name, int defense) {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
    }
}