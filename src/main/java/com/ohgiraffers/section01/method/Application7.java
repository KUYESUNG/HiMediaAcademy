package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        /* 필기. static 메소드 호출
        *   static 메소드를 호출하는 방법부터 먼저 학습해보자.
        *   static이 있는 메소드이건 non-static 메소드이건 메소드의 동작 흐름은 동일한다. */

        /* static 메소드 호출하는 방법
        *  클래스명.메소드명();
        * */

        System.out.println("10과 20의 합 : " + Application7.sumTwoNumbers(10, 20));
        System.out.println("10과 20의 합 : " + sumTwoNumbers(10, 20));


    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
