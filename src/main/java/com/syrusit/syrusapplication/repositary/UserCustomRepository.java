package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SystemUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCustomRepository {

    public SystemUser findByUsername(String userName);


}
