package com.ohgiraffers.practice;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {
            printResult = new PrintResult();
            employeeService = new EmployeeService();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }
    }

    public void selectEmployeeById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int phone = Integer.parseInt(parameter.get("phone"));
        String no = parameter.get("no");
        String jCode = parameter.get("jCode");
        String level = parameter.get("level");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);
        employee.setName(name);
        employee.setPhone(phone);
        employee.setNo(no);
        employee.setjCode(jCode);
        employee.setLevel(level);

        if (employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String jCode = parameter.get("jCode");
        String level = parameter.get("level");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);
        employee.setjCode(jCode);
        employee.setLevel(level);

        if (employeeService.modifyEmployee(employee)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        if (employeeService.deleteEmployee(id)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
