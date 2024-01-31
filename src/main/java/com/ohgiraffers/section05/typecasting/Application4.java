package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        /* 수업 목표. 형변환 시 주의할 점을 이해하고 사용할 수 있다. */

        /* 목차 1. 의도하지 않은 데이터 손실 */
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);

        /* 목차 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight);
    }
}
