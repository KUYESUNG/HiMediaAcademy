package com.ogiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 얕은복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */
        /* 필기.
        *  얕은 복사의 활용
        *  얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("name의 hashcode : " + names.hashCode());

        // 인자와 매개변수로 활용
        print(names);

        // 리턴값으로 활용
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

    }

    public static void print(String[] sarr) {

        System.out.println("sarr의 hashcode : " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        // 얕은복사 확인을 위해 hashcode 출력
        System.out.println("새로만든 animals의 hashcode : " + animals.hashCode());

        return animals;
    }
}
