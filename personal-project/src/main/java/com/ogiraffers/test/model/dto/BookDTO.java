package com.ogiraffers.test.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;

    private String author;

    public BookDTO() {}

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {

        String str = "";

        switch (category) {
            case 1 :
                str = "인문";
                break;
            case 2 :
                str = "자연과학";
                break;
            case 3 :
                str = "의료";
                break;
            case 4 :
                str = "기타";
                break;


        }
        return "도서정보[" +
                "도서 번호 =" + bNo +
                ", 도서분류코드 =" + category +
                ", 도서 제목='" + title + '\'' +
                ", 도서 저자='" + author + '\'' +
                ']';
    }
}
