package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        * 필기.
        * [switch문 표현식]
        *  switch(비교할변수) {
        *     case 비교값1: 비교값1과 일치하는 경우 실행할 구문; break;
        *     case 비교값2: 비교값2와 일치하는 경우 실행할 구문; break;
        *     default : case에 모두 해당하지 않을 경우 실행할 구문; break;
        * }
        * */

        /* 필기.
        *  switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        *  실수와 논리는 비교할 수 없다.
        *  또한 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할 수 없다.
        *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
        * */

        /* 필기.
        *  정수 두 개와 연산 기호 문자를 입력 받아서
        *  두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+' :
                result  = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine() {

        System.out.println("======= Ohgiraffers vending machine ======");
        System.out.println(" 사이다  콜라  환타  박카스  핫식스");
        System.out.println("===========================================");
        System.out.print("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selecterDrink = sc.nextLine();

        int price = 0;

        String order = "";

        switch (selecterDrink) {
            case "사이다" :
                order = "사이다";
                price = 500;
                break;
            case "콜라":
                order = "콜라";
                price = 600;
                break;
            case "환타":
                order = "환타";
                price = 700;
                break;
            case "박카스":
                order = "박카스";
                price = 2000;
                break;
            case "핫식스":
                order = "핫식스";
                price = 5000;
                break;
        }

        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");
    }
}
