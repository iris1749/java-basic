package day6;

import java.util.ArrayList;
public class ArrayListExam {
    public static void main(String[] args) {
//        int[] arr = new int[1000];
//        arr[0] = 10; // 0번째 인덱스 사용
//
//        arr[10] = 100; // 10번째 인덱스 사용


        // 배열은 크기가 고정이라 유연 X

        // 동적배열 -> 길이를 정하지 않고 유 동적으로 변하게 함.
        // 동적배열(ArryList)은 객체만 저장 가능

        // 원시타입 -> int, double, boolean
        // 원시타입을 제외한 자바의 모든 것은 객체임.
        // 원시타입의 객체타입 존재.
        // int -> Integer, double -> Double, boolean -> Boolean

        ArrayList<Integer> list = new ArrayList<>(); //int ArrayList

        list.add(10);
        list.add(20);
        list.add(30);

        // 값 가져오기
        int rst = list.get(1);
        System.out.println(rst);

        // 값 삭제하기
        list.remove(1);
        System.out.println(list.get(1)); // 30
//        System.out.println(list.get(2)); // remove 후 2번째 인덱스는 없어짐.

        // Arraylist의 크기 확인
        int size = list.size();
        System.out.println(size); // 2

        // Arraylist의 모든 값 출력
        // 마지막
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
