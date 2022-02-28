package com.adilmx.jpaApp.dao.impl;

import com.adilmx.jpaApp.dao.PersistenceFcatory;
import com.adilmx.jpaApp.dao.UserDao;
import com.adilmx.jpaApp.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserDaoImpl implements UserDao {
    EntityManager entityManager = PersistenceFcatory.getEntityManagerFactory().createEntityManager();

    @Override
    public User findById(Long id) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        User user = entityManager.find(User.class,id);
        entityTransaction.commit();
        return user;
    }

    @Override
    public boolean save(User user) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(user);
        entityTransaction.commit();
        return true;
    }
}
