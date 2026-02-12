package com.itservicerequest;

import com.itservicerequest.db.DbInit;

public class Main {
    public static void main(String[] args) throws Exception {
        DbInit.init();
        System.out.println("DB initialized!");
    }
}
