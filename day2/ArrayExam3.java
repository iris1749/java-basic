package day2;

public class ArrayExam3 {
    public static void main(String[] args) {

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int[] arr = {1,2,3,4,5};
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[4-i]);
           }
    }

}
