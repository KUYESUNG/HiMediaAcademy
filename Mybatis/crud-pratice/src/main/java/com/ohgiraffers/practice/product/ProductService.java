package com.ohgiraffers.practice.product;

import com.ohgiraffers.practice.ProductAndRentalDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.product.Template.getSqlSession;

public class ProductService {
    public List<ProductAndRentalDTO> showAll() {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductAndRentalDTO> productList = productMapper.showAll();

        sqlSession.close();

        return productList;
    }

    public ProductAndRentalDTO searchProductById(int id) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        ProductAndRentalDTO productAndRental = productMapper.searchProductById(id);

        sqlSession.close();

        return productAndRental;
    }

    public boolean productRegist(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.productRegist(product);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result> 0? true : false;
    }

    public boolean deleteProduct(int id) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.deleteProduct(id);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result> 0? true : false;
    }
}
