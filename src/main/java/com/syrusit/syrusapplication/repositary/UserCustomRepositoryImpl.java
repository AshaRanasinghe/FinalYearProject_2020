package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SystemUser;

import javax.persistence.*;

public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;


    @Override
    public SystemUser findByUsername(String userName) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();

            Query query = entityManager.createNativeQuery("SELECT * FROM SystemUser WHERE username=? ", SystemUser.class);


            query.setParameter(1,userName);

            SystemUser use = null;

            // to catch the unexpected error
            try {
                if (query.getSingleResult() != null)
                    // Java Casting - Force Conversion of Data Types
                    use = (SystemUser) query.getSingleResult();
            }catch(NoResultException e){
                // need to handle exception
                // exception need to write in Exception Log file with current time
            }
            return use;
    }
}
