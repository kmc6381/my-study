package org.example.kr.ac.sahmyook.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 있는 돈은 " + money + "입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
         } else {
            throw new Exception(); //throw 밑에 코드 쓰는거 불가능.
        }

        System.out.println("즐거운 쇼핑 되세요.");
    }
}
