package com.min56.backend.security;

import com.min56.backend.dto.response.TokenResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtProvider {

    public TokenResponse generateToken(String userId) {
        String accessToken = Jwts.builder()
                .setSubject(userId)
                .setHeaderParam("typ", "access")
                .signWith(SignatureAlgorithm.HS256, "101")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+7200))
                .compact();

        return new TokenResponse(
                accessToken
        );
    }
}
