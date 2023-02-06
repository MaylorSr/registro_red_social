package com.triana.salesianos.registro_red_social.exception;



import javax.persistence.EntityNotFoundException;

public class GlobalEntityListNotFoundException extends EntityNotFoundException {

    public GlobalEntityListNotFoundException(String message) {
        super(String.format(message));
    }
}