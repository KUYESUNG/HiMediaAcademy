package com.ogiraffers.persnalproject1;

public class Tiger extends Animal {
    @Override
    public void eat() {         // 호랑이의 먹이에대한 반응.
        if (random == 1) {
            System.out.println("호랑이가 먹이를 받아먹습니다.");
        } else {
            System.out.println("호랑이가 먹이를 무시합니다.");
        }
    }
    @Override
    public void scream() {      // 호랑이의 포효.
        System.out.println("어흥!");
    }
}
