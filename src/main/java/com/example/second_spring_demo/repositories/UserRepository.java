package com.example.second_spring_demo.repositories;

import com.example.second_spring_demo.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findByID(Integer userID);
}
