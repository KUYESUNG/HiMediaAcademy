package com.ogiraffers.persnalproject1;

import java.util.Random;

public class Animal {

    public void scream() {
        System.out.println("동물이 포효합니다.");
    } // 동물 포효.


    public void eat() {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 1;
        if (randomNumber == 1) {
            System.out.println("동물이 먹이를 받아먹습니다.");
        } else {
            System.out.println("동물이 먹이를 무시합니다.");
        }
    }
}
