package com.triana.salesianos.registro_red_social.service;

import com.triana.salesianos.registro_red_social.dtos.CreateUserRequest;
import com.triana.salesianos.registro_red_social.dtos.UserResponse;
import com.triana.salesianos.registro_red_social.exception.GlobalEntityListNotFoundException;
import com.triana.salesianos.registro_red_social.model.User;
import com.triana.salesianos.registro_red_social.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public List<UserResponse> findAllUsers() {
        String message = "The list was not found";

        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            throw new GlobalEntityListNotFoundException(message);

        }
        return users.stream().map(UserResponse::of).toList();
    }

    public UserResponse requestUser(CreateUserRequest createUserRequest) {
        User newUser = userRepository.save(
                User.builder()
                        .userName(createUserRequest.getUserName())
                        .email(createUserRequest.getEmail())
                        .password(createUserRequest.getPassword())
                        .build()
        );
        return UserResponse.of(newUser);
    }

    public boolean userExists(String s) {
        return userRepository.existsByUserNameIgnoreCase(s);
    }

    public boolean userExistsEmail(String s) {
        return userRepository.existsByEmailIgnoreCase(s);
    }

}
