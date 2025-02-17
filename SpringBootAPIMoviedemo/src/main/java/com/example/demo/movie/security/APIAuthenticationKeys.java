package com.example.demo.movie.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import java.util.Collection;


public class APIAuthenticationKeys extends AbstractAuthenticationToken {

	private static final long serialVersionUID = 1L;
	private final String apiKey;

	    public APIAuthenticationKeys(String apiKey, Collection<? extends GrantedAuthority> authorities) {
	        super(authorities);
	        this.apiKey = apiKey;
	        setAuthenticated(true);
	    }

	    @Override
	    public Object getCredentials() {
	        return null;
	    }

	    @Override
	    public Object getPrincipal() {
	        return apiKey;
	    }
}