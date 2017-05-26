package com.kienvu.bookstore.service.impl;

import com.kienvu.bookstore.domain.User;
import com.kienvu.bookstore.domain.security.PasswordResetToken;
import com.kienvu.bookstore.repository.PasswordResetTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vukien104 on 25/05/2017.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(String token) {
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override
    public void createPasswordResetTokenForUser(User user, String token) {
        final PasswordResetToken passwordResetToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(passwordResetToken);
    }
}
