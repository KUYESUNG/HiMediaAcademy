package com.ohgiraffers.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ComputerController computerController = new ComputerController();

        do {
            System.out.println("=================== 구산디지털단지에 오신걸 환영합니다! ===================");
            System.out.println("1. 제품 전체 보기");
            System.out.println("2. 제품 번호로 제품 상세 검색");
            System.out.println("3. 제품 번호로 제품 대여 상태 변경");
            System.out.println("4. 제품 등록");
            System.out.println("5. 제품 삭제");
            System.out.print("원하시는 옵션을 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : computerController.showAll(); break;
                case 2 : computerController.searchProductById(inputId()); break;
                case 3 : computerController.modifyRentalById(inputModifyRental()); break;
                case 4 : computerController.registComputer(inputComputer()); break;
                case 5 : computerController.deleteComputer(inputId()); break;
                default :
                    System.out.println("다시 골라!"); break;
            }

        } while (true);
    }

    private static Map<String, String> inputId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("제품 번호를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputModifyRental() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 제품 번호를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("대여 가능 상태를 수정해주세요 (Y or N) : ");
        String rental = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("rental", rental);

        return parameter;
    }

    private static Map<String, String> inputComputer() {

        Scanner sc = new Scanner(System.in);
        System.out.print("모델명을 입력해주세요 : ");
        String model = sc.nextLine();
        System.out.print("ram 용량을 입력해주세요 : ");
        String ram = sc.nextLine();
        System.out.print("ssd 용량을 입력해주세요 : ");
        String ssd = sc.nextLine();
        System.out.print("brand를 입력해주세요 : ");
        String brand = sc.nextLine();
        System.out.print("제조일자를 입력해주세요 : ");
        String date = sc.nextLine();
        System.out.print("가격을 입력해주세요 : ");
        String price = sc.nextLine();
        System.out.print("대여 가능 여부를 입력해주세요 : ");
        String rental = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("model", model);
        parameter.put("ram", ram);
        parameter.put("ssd", ssd);
        parameter.put("brand", brand);
        parameter.put("date", date);
        parameter.put("price", price);
        parameter.put("rental", rental);

        return parameter;
    }
}
