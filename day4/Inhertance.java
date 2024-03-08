package day4;

public class Inhertance {
    public static void main(String[] args) {
        // 프로그래밍 -> 중복과의 싸움
        // 데이터의 중복 -> 변수
        // 코드의 중복 -> 함수
        // 변수 / 함수의 중복 -> 클래스
        // 객체의 중복 -> 상속

        Dog d1 = new Dog();
        d1.bark();
        d1.breath();

        Cat c1 = new Cat();
        c1.meow();
        c1.breath();

    }
}

class Animal {
    public void eat() {
        System.out.println("먹는다");
    }
    public void breath() {
        System.out.println("숨을쉰다~~!!");
    }
}
class Dog  extends  Animal{
    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    public void meow() {
        System.out.println("냐옹");
    }
}
