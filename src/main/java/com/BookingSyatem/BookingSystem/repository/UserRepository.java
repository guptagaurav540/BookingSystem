package com.BookingSyatem.BookingSystem.repository;


import com.BookingSyatem.BookingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(String string);

    void deleteByUserId(String id);
}