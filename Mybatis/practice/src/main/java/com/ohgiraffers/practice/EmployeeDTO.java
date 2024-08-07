package com.ohgiraffers.practice;

public class EmployeeDTO {

    private int id;
    private String name;
    private String no;
    private String email;
    private int phone;
    private String dCode;
    private String jCode;
    private String level;
    private int salary;
    private double bonus;
    private int mId;
    private String hDate;
    private String eDate;
    private String eYn;

    public EmployeeDTO() {}

    public EmployeeDTO(int id, String name, String no, String email, int phone, String dCode, String jCode, String level, int salary, double bonus, int mId, String hDate, String eDate, String eYn) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.dCode = dCode;
        this.jCode = jCode;
        this.level = level;
        this.salary = salary;
        this.bonus = bonus;
        this.mId = mId;
        this.hDate = hDate;
        this.eDate = eDate;
        this.eYn = eYn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getdCode() {
        return dCode;
    }

    public void setdCode(String dCode) {
        this.dCode = dCode;
    }

    public String getjCode() {
        return jCode;
    }

    public void setjCode(String jCode) {
        this.jCode = jCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String gethDate() {
        return hDate;
    }

    public void sethDate(String hDate) {
        this.hDate = hDate;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }

    public String geteYn() {
        return eYn;
    }

    public void seteYn(String eYn) {
        this.eYn = eYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", dCode='" + dCode + '\'' +
                ", jCode='" + jCode + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", mId=" + mId +
                ", hDate='" + hDate + '\'' +
                ", eDate='" + eDate + '\'' +
                ", eYn='" + eYn + '\'' +
                '}';
    }
}
