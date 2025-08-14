package com.ead.authuser.repositories;

import com.ead.authuser.enums.RoleType;
import com.ead.authuser.models.RoleModel;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends Repository<RoleModel, UUID> {

    Optional<RoleModel> findByRoleName(RoleType roleName);
}