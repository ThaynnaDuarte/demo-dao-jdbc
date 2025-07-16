package io.github.thaynnaduarte.model.dao;

import io.github.thaynnaduarte.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
