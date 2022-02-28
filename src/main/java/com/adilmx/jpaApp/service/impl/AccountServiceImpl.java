package com.adilmx.jpaApp.service.impl;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.dao.AccountDao;
import com.adilmx.jpaApp.dao.impl.AccountDaoImpl;
import com.adilmx.jpaApp.model.Account;
import com.adilmx.jpaApp.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao ;

    public AccountServiceImpl() {
        this.accountDao = new AccountDaoImpl();
    }

    @Override
    public int saveAccount(Account account) {
        int isSaved = 0;
        boolean res =  accountDao.save(account);
        if(res){
            isSaved = 1;
        }
        return isSaved;
    }

    @Override
    public List<Account> findByType(AccountType type) {
        List<Account> accounts = accountDao.findByType(type);
        return accounts;
    }

    @Override
    public Account findById(Long id) {
        return accountDao.findById(id);
    }
}
