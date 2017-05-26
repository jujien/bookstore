package com.kienvu.bookstore.repository;

import com.kienvu.bookstore.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vukien104 on 24/05/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
