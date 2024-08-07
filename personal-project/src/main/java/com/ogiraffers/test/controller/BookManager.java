package com.ogiraffers.test.controller;

import com.ogiraffers.test.model.comparator.AscCategory;
import com.ogiraffers.test.model.comparator.DescCategory;
import com.ogiraffers.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.Objects;

public class BookManager {

    public BookManager() {
    }

    ArrayList<BookDTO> bookDTOArrayList = new ArrayList<>();

    BookDTO bookDTO = new BookDTO();

    public void addBook(BookDTO bookDTO) {
        bookDTOArrayList.add(bookDTO);
    }

    public void deleteBook(int bNO) {
        for (BookDTO book : bookDTOArrayList) {
            if (book.getbNo() == bNO) {
                bookDTOArrayList.remove(book);
                System.out.println("해당 도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서가 존재하지 않습니다.");
    }

    public int searchBook(String title) {
        int target = 0;
        for (int i = 0; i < bookDTOArrayList.size(); i++) {
            if (bookDTOArrayList.get(i).getTitle().equals(title)) {
                target = i;
            }
        }

        System.out.println("검색하신 " + title + "의 도서 번호는 " + bookDTOArrayList.get(target).getbNo() + ", 인덱스 번호는 " + target + "입니다. ");
        return target;
    }

    public void printBook(int index) {
        Object [] temp = bookDTOArrayList.toArray();
        System.out.println(temp[index]);
    }

    public void displayAll() {
        for (BookDTO bookDTO : bookDTOArrayList) {
            System.out.println(bookDTO);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        switch (select) {
            case 1 :
                bookDTOArrayList.sort(new AscCategory());
                break;
            case 2 :
                bookDTOArrayList.sort(new DescCategory());
                break;
        }

        return bookDTOArrayList;
    }

    public void printBookList (ArrayList<BookDTO> br) {
        for (BookDTO bookDTO : br) {
            System.out.println(bookDTO);
        }
    }
}
