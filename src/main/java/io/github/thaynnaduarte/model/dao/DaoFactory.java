package io.github.thaynnaduarte.model.dao;

import io.github.thaynnaduarte.db.DB;
import io.github.thaynnaduarte.impl.DepartmentDaoJDBC;
import io.github.thaynnaduarte.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }


    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
