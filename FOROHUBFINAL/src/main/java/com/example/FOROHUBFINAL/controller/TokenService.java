package com.example.FOROHUBFINAL.controller;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.springframework.security.config.Elements.JWT;

public class TokenService {
    =
import java.util.Date;

    @Service
    public class TokenService {
        private static final String SECRET = "mi_secreto_super_seguro";
        private static final long EXPIRATION_TIME = 86400000; // 1 día

        public String generateToken(Authentication authentication) {
            return JWT.create()
                    .withSubject(authentication.getName())
                    .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .sign(Algorithm.HMAC256(SECRET));
        }
    }

}
