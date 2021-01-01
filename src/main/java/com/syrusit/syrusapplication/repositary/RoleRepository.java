package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<UserRole,Integer> {
}
