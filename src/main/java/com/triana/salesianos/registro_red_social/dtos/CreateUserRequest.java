package com.triana.salesianos.registro_red_social.dtos;

import com.triana.salesianos.registro_red_social.validation.annotation.FieldsValueMatch;
import com.triana.salesianos.registro_red_social.validation.annotation.StrongPassword;
import com.triana.salesianos.registro_red_social.validation.annotation.UniqueEmail;
import com.triana.salesianos.registro_red_social.validation.annotation.UniqueUserName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldsValueMatch(field = "password", fieldMatch = "verifyPassword",
        message = "{newUserDto.password.nomatch}")
public class CreateUserRequest {


    @NotBlank(message = "{newUserDto.unique.name.blank}")
    @UniqueUserName(message = "{newUserDto.unique.name}")
    private String userName;
    @NotBlank(message = "{newUserDto.unique.email.blank}")
    @UniqueEmail(message = "{newUserDto.unique.email}")
    @Email(message = "The structure of email was not good")
    private String email;

    @StrongPassword()
    @NotEmpty(message = "{newUserDto.unique.password.blank}")
    private String password;
    @StrongPassword()
    @NotEmpty(message = "{newUserDto.unique.password.blank}")
    private String verifyPassword;

}
