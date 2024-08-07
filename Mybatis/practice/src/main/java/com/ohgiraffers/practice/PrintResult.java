package com.ohgiraffers.practice;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        System.out.println("=============== 회원 전체 조회를 시작합니다. ===================");

        for (EmployeeDTO employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectAllList" : errorMessage = "직원 목록 조회를 실패하엿습니다."; break;
            case "selectOne" : errorMessage = "직원 상세 조회에 실패하였습니다."; break;
            case "modify" : errorMessage = "직원 정보 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "직원 삭제에 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printEmployee(EmployeeDTO employee) {
        System.out.println("===========  선택하신 아이디의 직원정보를 출력합니다 ============");
        System.out.println(employee);
    }

    public void printSuccessMessage(String Message) {

        String successMessage = "";
        switch (Message) {
            case "insert" : successMessage = "신규 직원 등록을 성공하였습니다."; break;
            case "modify" : successMessage = "직원 정보 수정이 완료되었습니다."; break;
            case "delete" : successMessage = "직원이 삭제 되었습니다."; break;
        }

        System.out.println(successMessage);
    }
}
