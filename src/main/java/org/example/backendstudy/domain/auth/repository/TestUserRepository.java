package org.example.backendstudy.domain.auth.repository;

import org.example.backendstudy.domain.auth.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {
    TestUser findByUserEmail(String userEmail);
}
