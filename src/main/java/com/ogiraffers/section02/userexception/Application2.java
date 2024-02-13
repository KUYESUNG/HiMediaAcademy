package com.ogiraffers.section02.userexception;

import com.ogiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ogiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ogiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 다양한 타입의 예외를 multi block을 이용해서 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, -30000);

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생!");
            System.out.println(e.getMessage());

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
