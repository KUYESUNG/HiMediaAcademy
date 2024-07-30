package com.ogiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. try-catch 블럭을 이용해서 예외처리를 할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(50000,10000);

            System.out.println("================= 상품 구입 가능 ===================");
        } catch (Exception e) {

            System.out.println("================= 상품 구입 불가 ===================");

        }

        System.out.println("프로그램을 종료합니다.");
    }
}
