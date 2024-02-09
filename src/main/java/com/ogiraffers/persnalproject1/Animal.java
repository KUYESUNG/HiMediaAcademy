package com.ogiraffers.persnalproject1;

import java.util.Random;

public class Animal {

    public void scream() {
        System.out.println("동물이 포효합니다.");
    }

    int random = (int)(Math.random() * 2 ) + 1;
    public void eat() {
        if (random == 1) {
            System.out.println("동물이 먹이를 받아먹습니다.");
        } else {
            System.out.println("동물이 먹이를 무시합니다.");
        }
    }
}
