package com.projetinho.projetoSimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetinho.projetoSimples.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
