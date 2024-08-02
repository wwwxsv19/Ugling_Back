package org.example.backendstudy.domain.auth;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;

    private String userEmail;

    private String password;
}
