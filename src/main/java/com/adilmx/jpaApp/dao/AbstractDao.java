package com.adilmx.jpaApp.dao;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.model.Account;

import java.util.List;

public interface AbstractDao<T,ID> {
    public T findById(ID id);
    public boolean save(T o);
}
