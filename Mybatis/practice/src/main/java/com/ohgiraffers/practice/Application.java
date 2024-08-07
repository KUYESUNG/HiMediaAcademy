package com.ohgiraffers.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();
        do {
            System.out.println("========= 실행할 메뉴를 골라주세요 =========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 탈퇴");
            System.out.print("메뉴를 선택 하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : employeeController.selectAllEmployee(); break;
                case 2 : employeeController.selectEmployeeById(inputEmployeeId()); break;
                case 3 : employeeController.registEmployee(inputEmployee()); break;
                case 4 : employeeController.modifyEmployee(inputModifyEmployee()); break;
                case 5 : employeeController.deleteEmployee(inputEmployeeId()); break;
                default :
                    System.out.println("잘못된 메뉴를 선택하였습니다."); break;
            }
        } while (true);
    }

    private static Map<String, String> inputEmployeeId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("회원 아이디를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("직원 핸드폰번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("직원 주민등록번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("직원 직급코드를 입력하세요 : ");
        String jCode = sc.nextLine();
        System.out.print("직원 급여등급을 입력하세요 : ");
        String level = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("phone", phone);
        parameter.put("no", no);
        parameter.put("jCode", jCode);
        parameter.put("level", level);

        return parameter;
    }

    private static Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 직원 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 직급코드를 입력하세요 : ");
        String jCode = sc.nextLine();
        System.out.print("수정할 급여등급을 입력하세요 : ");
        String level = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("jCode", jCode);
        parameter.put("level", level);

        return parameter;
    }

}
