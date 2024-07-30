package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 논리연산자의 운선순위에 대해 이해해하고 활용할 수 있다. */
        /* 필기
        *   논리 연산자의 우선순위와 활용
        *  && : 11순위
        *  || : 12순위
        * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위가 높다.
        * */

        /* 목차 1. 1부터 100사이의  값인지 확인 */
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 목차 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        /* 목차 3. 영문자인지 확인 */
        /* 필기. A : 65, Z : 90, a : 97, z : 122 (중간에 91~96까지는 영문자가 아님) */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >=  97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >=  97 && ch6 <= 122)));
    }
}
