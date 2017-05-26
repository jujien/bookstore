package com.kienvu.bookstore.service.impl;

import com.kienvu.bookstore.domain.User;
import com.kienvu.bookstore.domain.security.PasswordResetToken;

/**
 * Created by vukien104 on 25/05/2017.
 */
public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);
}
