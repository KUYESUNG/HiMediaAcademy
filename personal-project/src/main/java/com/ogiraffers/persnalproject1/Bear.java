package com.ogiraffers.persnalproject1;

import java.util.Random;

public class Bear extends Animal {
    @Override
    public void eat() {     // 곰의 먹이에대한 반응.
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 1;
        if (randomNumber == 1){
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
