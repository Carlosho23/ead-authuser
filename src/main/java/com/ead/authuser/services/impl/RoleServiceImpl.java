package com.ead.authuser.services.impl;

import com.ead.authuser.enums.RoleType;
import com.ead.authuser.models.RoleModel;
import com.ead.authuser.repositories.RoleRepository;
import com.ead.authuser.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    final RoleRepository roleRepository;

    @Override
    public RoleModel findByRoleName(RoleType roleType) {
        return roleRepository.findByRoleName(roleType).orElseThrow(() -> new RuntimeException("Error: Role is not found"));
    }
}
