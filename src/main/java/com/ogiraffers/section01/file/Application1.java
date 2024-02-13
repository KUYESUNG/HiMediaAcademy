package com.ogiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */

        /* JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
        * 대상 파일에 대한 정보를 인스턴스를 생성하고
        * 파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다.
        * */

        File file = new File("src/main/java/com/ogiraffers/section01/file/test.txt");

        try {
            boolean createSuccess = file.createNewFile();

            System.out.println("createSuccess = " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.length() + "byte");
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        boolean deleteSuccess = file.delete();

        System.out.println("deleteSuccess = " + deleteSuccess);
    }
}
