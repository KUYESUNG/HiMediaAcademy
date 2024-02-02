package com.ogiraffers.section02.encapsulation.problem1;

public class Monster {

    // 1. 필드로 몬스터 이름과 체력을 저장할 공간을 선언한다.
//    String name;
//    int hp;


    // 2. setHp를 이용해 필드에 간접 접근하기
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
        } else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}
