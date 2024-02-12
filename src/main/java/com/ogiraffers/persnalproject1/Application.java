package com.ogiraffers.persnalproject1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        프로그램 : 사파리 탐험
//
//        시스템 요구사항
//        1. 사파리 차는 앞,뒤로 움직이기, 원하는 장소에서 멈추기를 할 수 있다.
//        2. 관람자는 차를 승하차, 동물들에게 먹이주기를 할 수 있다.
//        3. 동물들은 차가오면 표효, 먹이 받아먹기를 할 수 있다.
//        4. 관람자는 차에 탑승한다.
//        5. 사파리 차는 앞 뒤로 움직임 그리고 멈추기가 가능하다.
//        6. 차가 동물의 서식지에 들어오면 해당 동물은 차를 보며 포효를 한다.
//        (동물은 곰, 늑대, 호랑이가 존재하며 각 3~4, 5~6, 7~8키로미터의 위치에 서식지가 존재한다)
//        7. 관람자는 동물에게 먹이를 줄수있다.
//        8. 동물은 랜덤으로 먹이를 먹을지 안먹을지 정해진다.
//
//        차가 해야 할 일
//        1. 앞으로 가기
//        2. 뒤로 가기
//        3. 멈추기
//
//        관람자가 해야 할 일
//        1. 승하차 하기
//        2. 원하는 방향 말하기
//        3. 먹이 주기
//
//        동물이 해야 할 일
//        1. 차가 오면 표효하기
//        2. 먹이에 대해 랜덤으로 반응하기

        Person person = new Person();
        Car car = new Car();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== 사파리 탐험 ==========");
            System.out.println("1. 승차하기");
            System.out.println("2. 전진");
            System.out.println("3. 후진");
            System.out.println("4. 머무르기");
            System.out.println("5. 하차하기");
            System.out.println("6. 동물에게 먹이 던지기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 : person.getIn(); break;
                case 2 : car.go(); break;
                case 3 : car.back(); break;
                case 4 : car.stay();
                         break;
                case 5 : person.getOut(); break;
                case 6 : person.throwFood(car); break;
                default : System.out.println("선택지에 없는 번호 입니다. 다시 입력하세요.");
            }

            if (num == 9) {
                break;
            }
        }
    }
}
