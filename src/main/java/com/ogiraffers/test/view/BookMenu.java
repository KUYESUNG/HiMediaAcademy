package com.ogiraffers.test.view;

import com.ogiraffers.test.controller.BookManager;
import com.ogiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);

        bm = new BookManager();

    }

    public void menu() {
        while (true) {
            System.out.println("========== 도서관리 프로그램 ==========");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 찾기");
            System.out.println("3. 도서 제거");
            System.out.println("4. 도서 목록");
            System.out.println("5. 프로그램 종료");
            System.out.println("번호를 입력하세요 : ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1 :
                    BookDTO newBook = inputBook();
                    bm.addBook(newBook);
                    break;
                case 2 :
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 3 :
                    bm.deleteBook(inputDeleteBookNumber());
                    break;
                case 4 :
                    bm.displayAll();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default :
                    System.out.println("잘못된 입렵입니다. 다시 입력해주세요.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.println("도서 번호 : ");
        int bNo = sc.nextInt();
        System.out.println("도서분류코드 (1.인문, 2.자연과학, 3.의료, 4.기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목 : ");
        String title = sc.nextLine();
        System.out.println("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("찾는 도서의 제목을 입력하세요 : ");
        return sc.nextLine();
    }

    public int inputDeleteBookNumber () {
        System.out.print("삭제할 도서의 번호를 입력하세요 : ");
        return sc.nextInt();
    }
}
