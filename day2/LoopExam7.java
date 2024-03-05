package day2;

public class LoopExam7 {
    public static void main(String[] args) {
        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
        int height = 7;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // println 은 출력후 줄바꿈을 진행하고
                // print 는 출력후 줄바굼을 진행하지 않음 (gpt)
            }
            System.out.println();
        }


    }
}
