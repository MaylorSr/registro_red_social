package com.triana.salesianos.registro_red_social.validation.validator;

import com.triana.salesianos.registro_red_social.service.UserService;
import com.triana.salesianos.registro_red_social.validation.annotation.UniqueUserName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {


    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.isEmpty()) {
            return true;
        }
        return StringUtils.hasText(s) && !userService.userExists(s);
    }
}
