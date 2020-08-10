package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.user;
import com.syrusit.syrusapplication.repositary.entity.UserCustomRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserCustomRepositoryimpl implements UserCustomRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public user findByUsername(String userName) {
        Query query =
                entityManager.createNativeQuery("SELECT * FROM User WHERE username = ?", user.class);

        // Query query = entityManager.createQuery("SELECT e FROM users e WHERE nic = ?1",user.class);

        query.setParameter(1, userName);
        user usr = null;
        try {
            if (query.getSingleResult() != null)
                // Java Casting - Force Conversion of Data Types
                usr = (user) query.getSingleResult();
        } catch (NoResultException e) {
            /*
             need to Cancle exception
             exception need to write in Exception Log file with current time
            */
        }
        return usr;

}
}

