package com.example.FOROHUBFINAL.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AuthController {



    @RestController
    @RequestMapping("/login")
    public class AuthController {

        private final AuthenticationManager authenticationManager;
        private final TokenService tokenService;

        public AuthController(AuthenticationManager authenticationManager, TokenService tokenService) {
            this.authenticationManager = authenticationManager;
            this.tokenService = tokenService;
        }

        @PostMapping
        public String login(@RequestBody LoginDTO loginDTO) {
            try {
                Authentication authentication = authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                loginDTO.getUsername(), loginDTO.getPassword()
                        )
                );
                return tokenService.generateToken(authentication);
            } catch (AuthenticationException e) {
                throw new RuntimeException("Credenciales inválidas");
            }
        }
    }

}
