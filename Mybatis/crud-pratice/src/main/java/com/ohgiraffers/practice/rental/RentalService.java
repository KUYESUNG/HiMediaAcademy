package com.ohgiraffers.practice.rental;

import org.apache.ibatis.session.SqlSession;

import static com.ohgiraffers.practice.rental.Template.getSqlSession;

public class RentalService {
    public static boolean modifyRental(RentalDTO rentalList) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper rentalMapper = sqlSession.getMapper(RentalMapper.class);

        int result = rentalMapper.modifyRental(rentalList);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean rentalRegist(RentalDTO rental2) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper rentalMapper = sqlSession.getMapper(RentalMapper.class);

        int result = rentalMapper.rentalRegist(rental2);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.close();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean deleteRental(int id) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper rentalMapper = sqlSession.getMapper(RentalMapper.class);

        int result = rentalMapper.deleteRental(id);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}
