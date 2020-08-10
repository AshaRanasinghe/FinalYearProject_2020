package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//public interface GenderRepository extends JpaRepository<Gender(entity class name),Integer(primary key value)>
@Repository
public interface GenderRepository extends JpaRepository<Gender,Integer> {

}
