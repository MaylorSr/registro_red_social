package com.triana.salesianos.registro_red_social.controller;

import com.triana.salesianos.registro_red_social.dtos.CreateUserRequest;
import com.triana.salesianos.registro_red_social.dtos.UserResponse;
import com.triana.salesianos.registro_red_social.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @GetMapping("/")
    public List<UserResponse> findAll() {
        return userService.findAllUsers();
    }


    @PostMapping("/")
    public ResponseEntity<UserResponse> newArtist(@Valid @RequestBody CreateUserRequest createUserRequest) {

        UserResponse created = userService.requestUser(createUserRequest);
        URI createdURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(created.getId()).toUri();

        return ResponseEntity
                .created(createdURI)
                .body(created);
    }

}
