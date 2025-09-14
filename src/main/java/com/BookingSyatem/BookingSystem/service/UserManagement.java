package com.BookingSyatem.BookingSystem.service;

import com.BookingSyatem.BookingSystem.entity.User;

public interface UserManagement {
    User createUser(User user);
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
