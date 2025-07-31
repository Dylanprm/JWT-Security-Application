package com.primus.security.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.primus.security.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByVerificationCode(String verificationCode);
}
