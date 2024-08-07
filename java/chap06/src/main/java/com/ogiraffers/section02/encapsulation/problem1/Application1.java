package com.ogiraffers.section02.encapsulation.problem1;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다.(1)*/
        /* 필드에 올바르지 않는 값이 들어가도 통제가 불가능하다. */

        Monster monster1 = new Monster();

        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name = " + monster1.name);
        System.out.println("monster1 hp = " + monster1.hp);

        Monster monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        Monster monster3= new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        System.out.println("monster3 name = " + monster3.name);
        System.out.println("monster3 hp = " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        System.out.println("monster4 name = " + monster4.name);
        System.out.println("monster4 hp = " + monster4.hp);    }
}
