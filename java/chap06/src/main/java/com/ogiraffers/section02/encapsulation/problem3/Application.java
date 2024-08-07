package com.ogiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        System.out.println(monster1);

        Monster monster2 = new Monster();
        monster2.name = "두치";
        monster2.hp = -500;

        System.out.println("monster2 = " + monster2);
        System.out.println(monster2.name);
        System.out.println(monster2.hp);
    }
}
