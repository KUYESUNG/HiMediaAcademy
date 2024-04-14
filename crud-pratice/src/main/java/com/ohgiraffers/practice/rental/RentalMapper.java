package com.ohgiraffers.practice.rental;

public interface RentalMapper {

    int modifyRental(RentalDTO rentalList);

    int rentalRegist(RentalDTO rental2);

    int deleteRental(int id);
}
