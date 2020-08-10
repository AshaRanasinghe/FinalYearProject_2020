package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation,Integer> {

}
