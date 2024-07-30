package com.ogiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 생성자의 작성 위치
    *   작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만,
    *   통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
    * */

    /* 생성자의 사용 목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
    * 3. 작성한 생성자 외에는 인스턴스를 생성한는 방법을 제공하지 않는다는 의미를 가진다.
    *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다. (초기값 전달 강제화)
    * */


    /* 생성자 작성 방법
    * [표현식]
    * 접근제한자 클래스명(매개변수) {
    *   인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
    *   this.필드명 = 매개변수;
    * }
    * */

    /* 생성자의 종류
    * 1. 기본생성자(매개변수 없는 생성자)
    * 2. 매개변수 있는 생성자
    * */

    public User() {

        /* 수행할 내용이 아무것도 존재하지 않는다. */
        System.out.println("User 클래스의 기본생성자 호출함...");
    }


    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함");
    }

    /* 복사 생성자 */
    /* 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화값으로 이용할 수 있다.
     *  동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다. (깊은복사)*/

    /* 매개변수로 전달받은 인스턴스의 주소로 접근한 필드의 값을 이용하여 새롭게 할당하는 필드 값을 초기화 함 */
    public User(User otherUser) {
//        this.id = otherUser.id;
//        this.pwd = otherUser.pwd;
//        this.name = otherUser.name;
//        this.enrollDate = otherUser.enrollDate;

        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);

        System.out.println("User 클래스의 복사생성자 호출함...");

        System.out.println("this의 hashcode : " + this.hashCode());
        System.out.println("OtherUser의 hashcode : " + otherUser.hashCode());
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /* this() 사용하기
        * this() 동일클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일함)
        * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
        * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 Compile Error가 발생한다.
        * */

        this(id, pwd, name);
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");


    }

    public String getInformation() {
        return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }

}
