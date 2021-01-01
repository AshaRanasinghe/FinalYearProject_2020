package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SupplierRepository extends JpaRepository <Supplier,Integer>{

}


