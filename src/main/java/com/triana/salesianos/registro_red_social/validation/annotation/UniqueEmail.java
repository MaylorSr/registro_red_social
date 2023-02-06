package com.triana.salesianos.registro_red_social.validation.annotation;


import com.triana.salesianos.registro_red_social.validation.validator.UniqueUserEmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUserEmailValidator.class)
@Documented
public @interface UniqueEmail {

    String message() default "The email of the user exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
