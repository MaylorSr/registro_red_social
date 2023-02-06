package com.triana.salesianos.registro_red_social.repository;

import com.triana.salesianos.registro_red_social.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUserNameIgnoreCase(String s);

    boolean existsByEmailIgnoreCase(String s);

}
