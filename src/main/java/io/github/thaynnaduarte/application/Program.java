package io.github.thaynnaduarte.application;

import io.github.thaynnaduarte.Department;
import io.github.thaynnaduarte.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Thaynná", "thaynnaduarte14@gmail.com", new Date(), 1400.0, obj);

        System.out.println(seller);
    }
}
