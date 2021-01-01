package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CategoryCustomRepositoryImpl implements CategoryCustomRepository{

    @PersistenceContext //set mapping for both table and entity
    EntityManager entityManager;

    @Override
    public List<Category> findByName(String name){

        Query query= entityManager.createNativeQuery("SELECT " +
                "*FROM Category where name like?",Category.class);
        name = name + "%";
        query.setParameter(1,name);

        List<Category> lstCategory = new ArrayList();

        try{
            if(query.getResultList() !=null)
                lstCategory = query.getResultList();
        }
        catch (NoResultException ex){}

        return lstCategory;
    }

}
