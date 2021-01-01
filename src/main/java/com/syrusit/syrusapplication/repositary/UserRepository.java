package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<SystemUser,Integer>,UserCustomRepository{



}
