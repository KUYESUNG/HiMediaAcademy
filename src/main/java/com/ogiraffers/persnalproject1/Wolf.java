package com.ogiraffers.persnalproject1;

public class Wolf extends Animal {
    @Override
    public void eat() {
        if (random == 1) {
            System.out.println("늑대가 먹이를 받아 먹습니다.");
        } else {
            System.out.println("늑대가 먹이를 무시합니다.");
        }
    }

    @Override
    public void scream() {
        System.out.println("아우~~~~~");
    }
}
