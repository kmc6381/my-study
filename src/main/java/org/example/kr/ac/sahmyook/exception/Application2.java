package org.example.kr.ac.sahmyook.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000,100000);

            System.out.println("=========상품 구입 가능==========");
        } catch (Exception e) {
            System.out.println("=========상품 구입 불가==========");

//            e.printStackTrace(); //보안과 성능 때문에 사영 안함.
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
