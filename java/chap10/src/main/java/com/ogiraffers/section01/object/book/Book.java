package com.ogiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {}

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        /* 두 인스턴스 주소가 같으면 이후 다른 내용을 비교할 것 없이 true를 반환한다. */
        if (this == obj) {
            return true;
        }

        /* 전달받은 레퍼런스변수에 null값이 저장되어 있다면 비교하려는 두 개의 인스턴스는
        * 서로 다른 인스턴스이다.
        * */
        if (obj == null) {
            return false;
        }

        /* 전달받은 레퍼런스 변수를 Book 타입으로 형변환하여 각 필드별로 비교를 시작한다. */
        Book other = (Book) obj;
        if (this.number != other.number) {
            return false;
        }

        /* 제목의 경우 비교 */
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        } else if(!this.title.equals((other.title))) {
            return false;
        }

        /* 작가의 경우 비교 */
        if (this.author == null) {

            if (other.author != null) {
                return false;
            }
        } else if (!this.author.equals(other.author)){
            return false;
        }

        /* 가격의 경우 비교 */
        if (this.price != other.price) {
            return false;
        }

        return true;
    }

}
