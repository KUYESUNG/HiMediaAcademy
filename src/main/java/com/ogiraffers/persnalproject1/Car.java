package com.ogiraffers.persnalproject1;

public class Car {

    private int meter;
    private Bear bear;
    private Wolf wolf;
    private Tiger tiger;

    public Car() {
        meter = 0; // 초기 거리 0으로 설정
        bear = new Bear();
        wolf = new Wolf();
        tiger = new Tiger();
    }

    public void receiveFood() {
        if (meter == 3) {
            System.out.println("곰 서식지에 도착했습니다.");
            bear.eat(); // 곰이 먹이를 먹는 상호작용
        } else if (meter == 4) {
            System.out.println("곰 서식지에 도착했습니다.");
            bear.eat(); // 곰이 먹이를 먹는 상호작용
        } else if (meter == 5) {
            System.out.println("늑대 서식지에 도착했습니다.");
            wolf.eat(); // 늑대가 먹이를 먹는 상호작용
        } else if (meter == 6) {
            System.out.println("늑대 서식지에 도착했습니다.");
            wolf.eat(); // 늑대가 먹이를 먹는 상호작용
        } else if (meter == 7) {
            System.out.println("호랑이 서식지에 도착했습니다.");
            tiger.eat(); // 호랑이가 먹이를 먹는 상호작용
        } else if (meter == 8) {
            System.out.println("호랑이 서식지에 도착했습니다.");
            tiger.eat(); // 호랑이가 먹이를 먹는 상호작용
        }
    }



    public void go() {      // 차가 앞으로 움직였을때.
        System.out.println("차가 앞으로 움직입니다.");
        this.meter += 1;
        System.out.println("차가 1km 앞으로 이동 했습니다.");
        if (meter == 3) {
            System.out.println("곰 서식지에 들어왔습니다.");
            bear.scream();
        }
        if (meter == 5) {
            System.out.println("늑대 서식지에 들어왔습니다.");
            wolf.scream();
        }
        if (meter == 7 ) {
            System.out.println("호랑이 서식지에 들어왔습니다.");
            tiger.scream();
        }
        if (meter > 8) {
            System.out.println("출구로 나왔습니다 탐험을 끝 마칩니다.");
        }
    }

    public void back() {        // 차가 뒤로 움직였을때
        System.out.println("차가 뒤로 움직입니다.");
        this.meter -= 1;
        System.out.println("차가 1km 뒤로 이동 했습니다.");
        if (meter == 4) {
            System.out.println("곰 서식지에 들어왔습니다.");
            bear.scream();
        }
        if (meter == 6) {
            System.out.println("늑대 서식지에 들어왔습니다.");
            wolf.scream();
        }
    }

    public void stay() {
        System.out.println("이동을 멈추었습니다.");
    }       // 차를 멈추었을때.
}
