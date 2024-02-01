package com.ogiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* 필기.
        *  배열의 사용 방법
        *  1. 배열의 선언
        *  2. 배열의 할당
        *  3. 배열의 인덱스 공간에 값 대입
        * */

        /* 1. 배열의 선언 */
        /* 필기.
        *  자료형[] 변수명;
        *  자료형 변수명[]; 로 선언할 수 있다.
        * */

        /* 필기.
        *  선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        *  new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 변환하는 연산자이다.
        *  발생한 주소를 레퍼런스변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형(reference type)이라고 한다.
        * */

        int[] iarr;
        char carr[];

//        iarr = new int[]; //크기를 지정해 주지 않아서 에러 발생
        iarr = new int[5];
        carr = new char[10];


        /* 필기.
        *   heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
        *  stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다. */


        System.out.println("iarr = " + iarr);
        System.out.println("carr = " + carr);

        /* 필기.
        *  hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        *  동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overiding 해서 사용한다.
        *  이 부분은 뒤에서 다루게 되니, 그 전까지는 쉽게 주소값이라고 생각하고 사용하자! */

        System.out.println(iarr.hashCode());
        System.out.println(carr.hashCode());

        /* 필기.
        *  배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다.
        *  참고. String의 문자열 길이는 메소드로 제공하고 있기 때문에 length()로 사용한다.
        * */

        System.out.println(iarr.length);
        System.out.println(carr.length);

        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println(darr.hashCode());
        System.out.println(darr.length);

        darr = new double[30];

        System.out.println("수정 후 hashcode : " + darr.hashCode());
        System.out.println("수정 후 length : " + darr.length);

        darr = null;

        /* 필기.
        *  NullPointerException 발생함
        *  아무것도 참조하지 않고 null 이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 될 때 발생하는 에러이다.
        * */

        System.out.println(darr.length);
    }
}
