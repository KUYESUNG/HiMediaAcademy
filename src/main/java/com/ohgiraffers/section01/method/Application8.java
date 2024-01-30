package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* 수업 목표. 다른 클래스에서 작성한 메소드를 호출할 수 있다. */

        int first = 100;
        int second = 50;

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);

        System.out.println("두 수 중 최소값은 : " + min);

        /* 주의사항.
        *  static 메소드도 non-static 메소드처럼 호출은 가능하다.
        *  하지만 권장하지 않는다.
        *  이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
        * */
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("두 수 중 최대값은 : " + max);
    }
}
