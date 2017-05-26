package com.kienvu.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by vukien104 on 24/05/2017.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
