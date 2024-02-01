package com.ogiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 배열의 사용목적은 이해할 수 있다. */
        /* 필기.
        *  배열이란?
        *  동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
        *  배열은 heap 영역에 new 연산자를 이용하여 할당한다. */

        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        arr [0] = 10;
        arr [1] = 20;
        arr [2] = 30;
        arr [3] = 40;
        arr [4] = 50;

        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
        }

        int sum = 0;
        sum += arr[0];
        sum += arr[1];
        sum += arr[2];
        sum += arr[3];
        sum += arr[4];

        System.out.println("sum = " + sum);

    }
}
