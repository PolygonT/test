package com.dao.impl;

import com.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    public void saveAccount() {
        System.out.println("保存账户...");
    }
}
