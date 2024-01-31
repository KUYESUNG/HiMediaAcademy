package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표, 변수의 사용 목적에 대해 이해할 수 있다. */
        /* 필기.
        *    변수의 사용 목적
        * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬우어지고, 협업 및 유지보수에 유리하기 때문이다.)
        * 2. 한 번 저장해둔 값을 재사용 하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때 보다 간편하게 변경할 수 있다.
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변하는 값을 저장하기 위한 공간이다.)
         */

        // 1. 값에 의미를 부여하기 위한 목적
        System.out.println("====================== 값에 의미 부여 테스트 ========================");
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");

        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        // 2. 한 번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("=========================== 변수에 저장한 값 재사용 테스트 ==============================");
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");

        int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");

        // 시간에 따라 변경되는 값을 저장하고 사용할 수 있다.
        System.out.println("========================== 변수에 저장된 값 변경 테스트 ===========================");
        // 변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간이다.
        int sum = 0;
        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은?" + sum);

        sum = sum + 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면?" + sum);

        int count = 0;

        count = count + 1;
        System.out.println("count에 1을 더하면 현재 count의 값은? " + count);
    }
}
