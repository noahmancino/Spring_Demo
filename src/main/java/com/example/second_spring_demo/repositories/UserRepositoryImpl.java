package com.example.second_spring_demo.repositories;

import com.example.second_spring_demo.domain.User;
import com.example.second_spring_demo.exceptions.EtAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String SQL_CREATE = "INSERT INTO ET_USERS(USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD) VALUES(NEXTVAL(ET_USERS_SEQ), ?, ?, ?, ?)";
    @Autowired
    JDBCTemplate jdbcTemplate;
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        try {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {

            }, keyHolder)

        } catch(Exception e) {
            throw new EtAuthException("Invalid details. Failed to create account");
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findByID(Integer userID) {
        return null;
    }
}
