package com.triana.salesianos.registro_red_social.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_name")

    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


}
