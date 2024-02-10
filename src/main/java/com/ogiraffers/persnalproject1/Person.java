package com.ogiraffers.persnalproject1;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);
    Animal animal = new Animal();
    Animal a1 = new Bear();
    Animal a2 = new Wolf();
    Animal a3 = new Tiger();

    public void feed() {            // 사람의 먹이주는 행동.
        System.out.println("동물에게 먹이를 주시겠습니까?");
        System.out.println(" 1. 네 | 2. 아니요 ");
        int selectFeed = sc.nextInt();
        if (selectFeed == 1) {
            System.out.println("먹이를 던졌습니다.");
        } else if (selectFeed == 2) {
            System.out.println("눈으로만 봅니다.");
        } else {
            System.out.println("눈으로만 보는거로 인식합니다.");
        }
    }

    public void Direction() {       // 사람의 방향성 선택.
        System.out.println("움직일 방향을 정하시오.");
        System.out.println(" 1. 앞 | 2. 뒤 ");
        int selectDirection = sc.nextInt();
        if (selectDirection == 1) {
            System.out.println("앞으로 1km 이동합니다.");
        }
        if (selectDirection == 2) {
            System.out.println("앞으로 2km 이동합니다.");
        }
    }

    public void getIn() {
        System.out.println("차에 탑승하시겠습니까?");
        System.out.println(" 1. 네 | 2. 아니요 ");
        int selectRiding = sc.nextInt();
    }

    public void getOut() {
        System.out.println("차에서 내리시겠습니까?");
        System.out.println(" 1. 네 | 2. 아니요 ");
        int selectDropping = sc.nextInt();
    }
}
