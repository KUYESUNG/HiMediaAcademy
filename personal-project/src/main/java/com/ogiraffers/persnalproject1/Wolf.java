package com.ogiraffers.persnalproject1;

import java.util.Random;

public class Wolf extends Animal {
    @Override
    public void eat() {         // 늑대의 먹이의 대한 반응.
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 1;
        if (randomNumber == 1) {
            System.out.println("늑대가 먹이를 받아 먹습니다.");
        } else {
            System.out.println("늑대가 먹이를 무시합니다.");
        }
    }

    @Override
    public void scream() {      // 늑대의 포효.
        System.out.println("아우~~~~~");
    }
}
