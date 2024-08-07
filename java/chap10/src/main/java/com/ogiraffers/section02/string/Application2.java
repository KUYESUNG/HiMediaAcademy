package com.ogiraffers.section02.string;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());






    }
}
