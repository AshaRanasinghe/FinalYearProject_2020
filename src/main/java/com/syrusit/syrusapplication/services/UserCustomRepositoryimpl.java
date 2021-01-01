package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SystemUser;
import com.syrusit.syrusapplication.repositary.UserCustomRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserCustomRepositoryimpl implements UserCustomRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SystemUser findByUsername(String userName) {
        Query query =
                entityManager.createNativeQuery("SELECT * FROM User WHERE username = ?", SystemUser.class);

        // Query query = entityManager.createQuery("SELECT e FROM users e WHERE nic = ?1",SystemUser.class);

        query.setParameter(1, userName);
        SystemUser usr = null;
        try {
            if (query.getSingleResult() != null)
                // Java Casting - Force Conversion of Data Types
                usr = (SystemUser) query.getSingleResult();
        } catch (NoResultException e) {
            /*
             need to Cancle exception
             exception need to write in Exception Log file with current time
            */
        }
        return usr;

}
}

