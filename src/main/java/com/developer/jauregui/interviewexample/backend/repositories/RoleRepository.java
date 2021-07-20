package com.developer.jauregui.interviewexample.backend.repositories;

import com.developer.jauregui.interviewexample.backend.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {


}
