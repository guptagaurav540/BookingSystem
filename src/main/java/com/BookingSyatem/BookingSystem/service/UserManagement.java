package com.BookingSyatem.BookingSystem.service;

import com.BookingSyatem.BookingSystem.entity.User;

public interface UserManagement {
    User createUser(User user);
    User getUserById(String id);
    User updateUser(String id, User user);
    void deleteUser(String id);
}
