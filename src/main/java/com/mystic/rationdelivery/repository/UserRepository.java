package com.mystic.rationdelivery.repository;

import com.mystic.rationdelivery.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends MongoRepository<User, String> {
    public User getUserByRationCardNumber(@Param("userId") String userId);
    public User getUserByAadharNumber(@Param("aadharNumber") String aadharNumber);
}
