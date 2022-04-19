package com.example.second_spring_demo.services;

import com.example.second_spring_demo.domain.User;
import com.example.second_spring_demo.exceptions.EtAuthException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
