package com.ogiraffers.persnalproject1;

public class Car {

    private int meter;

    Animal animal = new Animal();
    Animal a1 = new Bear();
    Animal a2 = new Wolf();
    Animal a3 = new Tiger();

    public void go() {      // 차가 앞으로 움직였을때.
        System.out.println("차가 앞으로 움직입니다.");
        this.meter += 1;
        System.out.println("차가 1km 앞으로 이동 했습니다.");
        if (meter == 3) {
            System.out.println("곰 서식지에 들어왔습니다.");
            a1.scream();
        }
        if (meter == 5) {
            System.out.println("늑대 서식지에 들어왔습니다.");
            a2.scream();
        }
        if (meter == 7 ) {
            System.out.println("호랑이 서식지에 들어왔습니다.");
            a3.scream();
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
            a1.scream();
        }
        if (meter == 6) {
            System.out.println("늑대 서식지에 들어왔습니다.");
            a2.scream();
        }
    }

    public void stay() {
        System.out.println("이동을 멈추었습니다.");
    }       // 차를 멈추었을때.
}
