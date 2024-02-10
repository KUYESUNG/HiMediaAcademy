package com.ogiraffers.persnalproject1;

public class Bear extends Animal {
    @Override
    public void eat() {     // 곰의 먹이에대한 반응.
        if (random == 1){
            System.out.println("곰이 먹이를 받아 먹습니다.");
        } else {
            System.out.println("곰이 먹이를 무시합니다.");
        }
    }

    @Override
    public void scream() {      // 곰의 포효.
        System.out.println("그르르르...");
    }
}
