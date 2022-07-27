package com.guest.app.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long>{
    UserModel findByUsername(String username);
}
