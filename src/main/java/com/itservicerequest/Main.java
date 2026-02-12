package com.itservicerequest;

import com.itservicerequest.dao.UserDao;
import com.itservicerequest.db.DbInit;
import com.itservicerequest.db.DbSeed;
import com.itservicerequest.model.User;

public class Main {
    public static void main(String[] args) throws Exception {
        DbInit.init();
        DbSeed.seed();
    }
}

