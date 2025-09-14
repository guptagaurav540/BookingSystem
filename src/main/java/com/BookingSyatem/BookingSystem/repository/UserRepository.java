package com.BookingSyatem.BookingSystem.repository;


import com.BookingSyatem.BookingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(Long string);
    User findByName(String name);
    void deleteByUserId(Long id);
}