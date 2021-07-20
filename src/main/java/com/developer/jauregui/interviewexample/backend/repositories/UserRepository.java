package com.developer.jauregui.interviewexample.backend.repositories;

import com.developer.jauregui.interviewexample.backend.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
