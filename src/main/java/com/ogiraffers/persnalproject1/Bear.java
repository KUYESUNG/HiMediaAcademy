package com.ogiraffers.persnalproject1;

public class Bear extends Animal {
    @Override
    public void eat() {
        if (random == 1){
            System.out.println("곰이 먹이를 받아 먹습니다.");
        } else {
            System.out.println("곰이 먹이를 무시합니다.");
        }
    }

    @Override
    public void scream() {
        System.out.println("그르르르...");
    }
}
