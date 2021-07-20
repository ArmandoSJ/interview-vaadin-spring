package com.developer.jauregui.interviewexample.backend.services;


import com.developer.jauregui.interviewexample.backend.Role;
import com.developer.jauregui.interviewexample.backend.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
//@RestController
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    //@Override
    public Collection<Role> findAll() {
        return roleRepository.findAll();
    }

    //@Override
    public Role addRole(Role role) {
        return roleRepository.insert(role);
    }

    //@Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    //@Override
    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }


}
