package com.adilmx.jpaApp.dao.impl;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.dao.AccountDao;
import com.adilmx.jpaApp.dao.PersistenceFcatory;
import com.adilmx.jpaApp.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    EntityManager entityManager = PersistenceFcatory.getEntityManagerFactory().createEntityManager();

    @Override
    public List<Account> findByType(AccountType type) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Query query = entityManager.createQuery("select a from Account a where a.type = :type");
        query.setParameter("type",type);
        List<Account> accounts =  query.getResultList();
        entityTransaction.commit();
        return accounts;
    }

    @Override
    public Account findById(Long id) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Account account = entityManager.find(Account.class,id);
        entityTransaction.commit();
        return account;
    }

    @Override
    public boolean save(Account account) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(account);
        entityTransaction.commit();
        return true;
    }
}
