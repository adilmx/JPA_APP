package com.adilmx.jpaApp.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceFcatory {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY ;
    static {
        try {
            ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("P_UNIT");
        }catch (Exception e){

        }
    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return ENTITY_MANAGER_FACTORY;
    }


}
