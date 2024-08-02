package org.example.backendstudy.domain.auth.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.backendstudy.domain.auth.TestUser;
import org.example.backendstudy.domain.auth.repository.TestUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class AuthService {
    private final TestUserRepository userRepository;

    @Transactional
    public boolean matchPassword(String reqPassword, String userPassword) {
        log.info("I got two password : {}, {}", reqPassword, userPassword);
        return userPassword.equals(reqPassword);
    }

    @Transactional
    public TestUser findUserByEmail(String email) {
        return userRepository.findByUserEmail(email);
    }
}
