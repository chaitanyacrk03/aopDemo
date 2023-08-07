package com.flashyy.aopDemo.dao;

import com.flashyy.aopDemo.Account.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDao{

    @Override
    public void addAccount(Account account) {
        System.out.print(getClass()+" This is the class");
    }
}
