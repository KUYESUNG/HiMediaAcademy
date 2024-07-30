package com.ogiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* 필기.
        *  생성자란?
        *  인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        *  생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        *  기본생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
        * */

        User user1 = new User();
        System.out.println(user1.getInformation());

        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());

        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());

        User user4 = new User(user3);
        System.out.println(user4.getInformation());
    }
}
