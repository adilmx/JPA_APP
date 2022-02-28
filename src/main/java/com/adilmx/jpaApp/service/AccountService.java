package com.adilmx.jpaApp.service;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.model.Account;

import java.util.List;

public interface AccountService {
    public int saveAccount(Account account);
    public List<Account> findByType(AccountType type);
    public Account findById(Long id);
}
