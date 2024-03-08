package day4;

public class AccountExam {
       public static void main(String[] args) {
        Account a1 = new Account ();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200

        Account a2 = new Account();

           a2.deposit(10000); // 1000원을 예금했습니다.
           a2.deposit(20000); // 2000원을 예금했습니다.
           a2.deposit(30000); // 3000원을 예금했습니다.

           int money1 = a2.withdraw(4000);
           System.out.println(money1); // 400

           int remainder1 = a2.getRemainder();
           System.out.println(remainder1); // 5600

           money1 = a2.withdraw(14000);
           System.out.println(money1); // 1400

           remainder1 = a2.getRemainder();
           System.out.println(remainder1); // 4200

    }
}
