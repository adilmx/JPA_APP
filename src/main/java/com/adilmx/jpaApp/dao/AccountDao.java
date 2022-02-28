package com.adilmx.jpaApp.dao;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.model.Account;

import java.util.List;

public interface AccountDao extends AbstractDao<Account,Long>{
    public List<Account> findByType(AccountType type);
}
