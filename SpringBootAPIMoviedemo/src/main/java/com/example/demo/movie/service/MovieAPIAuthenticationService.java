package com.example.demo.movie.service;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;

import com.example.demo.movie.security.APIAuthenticationKeys;

import jakarta.servlet.http.HttpServletRequest;

public class MovieAPIAuthenticationService {

    private static final String AUTH_TOKEN_HEADER_NAME = "apiKey";
    private static final String AUTH_TOKEN = "MovieAPIDemo";

    public static Authentication getAuthentication(HttpServletRequest request) {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);
        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new BadCredentialsException("Invalid API Key");
        }

        return new APIAuthenticationKeys(apiKey, AuthorityUtils.NO_AUTHORITIES);
    }
}
