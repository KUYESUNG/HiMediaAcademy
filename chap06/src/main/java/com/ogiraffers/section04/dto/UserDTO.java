package com.ogiraffers.section04.dto;

public class UserDTO {

    private String id;
    private String pwd;
    private String  name;
    private java.util.Date enrollDate;

    /* 기본 생성자 명시적으로 작성
    * 매개변수 있는 생성자를 선택적으로 추가할 수 있도록 기본생성자를 명시한다.
    * (명시하지 않고 추후 매개변수 있는 생성자를 추가할 시 에러 발생 가능성이 있기 때문이다.)
    * */
    public UserDTO() {}

    /* 매개변수 있는 생성자는 선택 사항이다.
     * 필요에 따라 만들지만 일반적으로 가장 많이 사용되는 생성자는 모든 필드를 초기화하는 생성자이다.
     * */
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(java.util.Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getid() {
        return id;
    }

    public String getpwd() {
        return pwd;
}

    public String getname() {
        return name;

    }

    public java.util.Date getEnrollDate() {
        return enrollDate;
    }

    public String getInformation() {
        return "UserDTO [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}