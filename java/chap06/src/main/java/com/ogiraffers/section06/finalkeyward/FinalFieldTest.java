package com.ogiraffers.section06.finalkeyward;

public class FinalFieldTest {

    /* 수업목표. final 키워드에 대해 이해할 수 있다 */
    /* final
    *  : final은 종단의 의미를 가지는 키워드이다
    *  final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다
    *  1. 지역변수 : 초기화 이후 값 변경 불가
    *  2. 매개변수 : 호출시 전달한 인자 변경 불가
    *  3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    *  4. 클래스(static)변수 : 프로그램 start 이후 값 변경 불가
    *  5. non-static 메소드 : 메소드 재작성(overriding) 불가
    *  6. static 메소드 : 메소드 재작성(overriding) 불가
    *  7. 클래스 : 상속 불가
    * */


    /* 목차 1. non-static field에 final 사용 */
//    private final int nonStaticNum; // 0으로 초기화되어 이후 변경 불가능

    /* 목차 1-1. 선언과 동시에 초기화 한다 */
    private final int NON_STATIC_NUM = 1;

    /* 목차 1-2. 생성자를 이용해서 초기화 한다 */
    private final String NON_STATIC_NAME;

    private FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    /* 목차 2. static field에 final 사용 */
//    private static final int STATIC_NUM;

    private static final int STATIC_NUM = 1;

//    private static final double STATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble) {
//        FinalFieldTest.STATIC_DOUBLE = staticDouble;
//    }

//    static {
//        STATIC_DOUBLE = 0.5;
//    }

}

