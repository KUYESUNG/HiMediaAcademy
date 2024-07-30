package com.ogiraffers.section03.filterstream.dto;

    /* 객체를 입출력 하기 위해서는 반드시 직렬화 처리를 해야한다.
    * 직렬화 대사 클래스에 Serializable 인터페이스 구현하면
    * 직렬화가 필요한 상황인 경우 해당 인터페이스를 상속 받았을 시 데이터를 직혈화 처리한다. */
public class MemberDTO implements java.io.Serializable {

    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;
    /* transient는 특정 필드를 직렬화에서 제외하기 위한 키워드이다.*/
    private /*transient*/ double point;

    public MemberDTO() {}

    public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.point = point;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

        @Override
        public String toString() {
            return "MemberDTO{" +
                    "id='" + id + '\'' +
                    ", pwd='" + pwd + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", point=" + point +
                    '}';
        }
    }
