package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<user,Integer>,UserCustomRepository{



}
