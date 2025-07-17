package io.github.thaynnaduarte.application;

import io.github.thaynnaduarte.Department;
import io.github.thaynnaduarte.Seller;
import io.github.thaynnaduarte.impl.SellerDaoJDBC;
import io.github.thaynnaduarte.model.dao.DaoFactory;
import io.github.thaynnaduarte.model.dao.SellerDao;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
