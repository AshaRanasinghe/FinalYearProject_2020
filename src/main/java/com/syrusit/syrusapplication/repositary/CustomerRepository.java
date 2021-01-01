package com.syrusit.syrusapplication.repositary;


import com.syrusit.syrusapplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{

}
