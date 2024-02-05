package com.ogiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /* 매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        * */

        ParameterTest pt = new ParameterTest();

        /* 목차 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        /* 기본자료형 8가지 모두 가능하다. */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /* 목차 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[]{1, 2, 3, 4, 5};

        System.out.println("인자로 전달되는 값 : " + iarr);
        pt.testPrimaryTypeArraryParameter(iarr);

        System.out.println("변경 후 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 목차 3. 클래스 자료형 */
        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("변경 후 사각형의 넓이와 둘레 ================");
        r1.claArea();
        r1.clacRound();

        /* 목차 5. 가변인자 */
//        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동"); // 가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
        pt.testVariableLengthArrayParameter("심사임당", new String[] {"테니스", "서예", "떡설기"});
    }
}
