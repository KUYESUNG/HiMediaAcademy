package com.ogiraffers.test.model.comparator;

import com.ogiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        if (o1.getCategory() > o2.getCategory()) {

            result = 1;

        } else if (o1.getCategory() < o2.getCategory()) {

            result = -1;

        } else {

            result = 0;

        }

        return result;
    }
}

