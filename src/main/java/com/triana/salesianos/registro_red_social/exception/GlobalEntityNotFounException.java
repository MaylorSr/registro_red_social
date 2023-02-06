package com.triana.salesianos.registro_red_social.exception;



import javax.persistence.EntityNotFoundException;

public class GlobalEntityNotFounException extends EntityNotFoundException {

    public GlobalEntityNotFounException(String message, Long id) {
        super(String.format(message, id));
    }


}
