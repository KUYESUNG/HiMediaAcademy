package com.ogiraffers.section01.user_type;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

//        System.out.println("id : " + id);
//        System.out.println("pwd = " + pwd);
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
//        System.out.println("gender = " + gender);
//        for (int i = 0; i < hobby.length; i++) {
//            System.out.println(hobby[i] + " ");
//        }


        /* 변수 선언 및 객체 생성 */
        /* 필기.
        *  자로형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
        *  사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야 한다.
        *  객체를 생성하게 되면 클래스에 정의한 필드와 메소드대로 객체(instance)가 생성된다.
        *  아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다.
        * */

        Member member = new Member();

        /* 필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
        *  '.'은 참조연산자 라고 하는데, 레퍼런스변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
        *  각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근이다)
        * */

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i] + " ");
        }
    }
}
