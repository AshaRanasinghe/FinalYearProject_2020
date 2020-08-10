package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.user;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCustomRepository {

    public user findByUsername(String userName);



}
