package me.dio.bibliotecaonlinev2.domain.repository.repository;

import me.dio.bibliotecaonlinev2.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPA ja tras todas as operacoes basicas de interacao com o BD
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
