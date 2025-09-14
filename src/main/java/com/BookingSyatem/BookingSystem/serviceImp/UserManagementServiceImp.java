package com.BookingSyatem.BookingSystem.serviceImp;

import com.BookingSyatem.BookingSystem.entity.User;
import com.BookingSyatem.BookingSystem.repository.UserRepository;
import com.BookingSyatem.BookingSystem.service.UserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserManagementServiceImp implements UserManagement {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findByUserId(id).orElse(null);
    }

    @Override
    public User updateUser(Long id, User user) {
        Optional<User> existingUser = userRepository.findByUserId(id);
        if (existingUser.isPresent()) {
            user.setUserId(id);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteByUserId(id);
    }
}