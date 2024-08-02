package org.example.backendstudy.domain.auth.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.backendstudy.domain.auth.TestUser;
import org.example.backendstudy.domain.auth.controller.dto.LoginRequest;
import org.example.backendstudy.domain.auth.controller.dto.LoginResponse;
import org.example.backendstudy.domain.auth.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) throws Exception {
        String email = request.getUserEmail();
        String password = request.getPassword();

        TestUser user = authService.findUserByEmail(email);

        if(!authService.matchPassword(password, user.getPassword())) {
            throw new Exception("Wrong Password");
        }

        LoginResponse response = LoginResponse.builder()
                .status(200)
                .build();

        return response;
    }
}
