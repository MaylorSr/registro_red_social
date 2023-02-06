package com.triana.salesianos.registro_red_social.validation.annotation;

import com.triana.salesianos.registro_red_social.validation.validator.UniqueUserNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUserNameValidator.class)
@Documented
public @interface UniqueUserName {
    String message() default "The name of the user exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}